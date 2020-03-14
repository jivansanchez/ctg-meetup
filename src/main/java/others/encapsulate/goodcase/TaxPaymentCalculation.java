package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public class TaxPaymentCalculation implements TaxCalculation {

    @Override
    public Double calculate(CitizenFinancialInformation citizenFinancialInformation) {

        Double deductionPercentage = new ConfigurationFileReader().getConfiguratinValue("deductionCalculationPercentage");
        Double declarationPercentage = new ConfigurationFileReader().getConfiguratinValue("declarationPercentage");
        Double retefuentePercentage = new ConfigurationFileReader().getConfiguratinValue("retefuentePercentage");
        Double socialAmount = new ConfigurationFileReader().getConfiguratinValue("socialAmount");
        Double reliefAmount = new ConfigurationFileReader().getConfiguratinValue("reliefAmount");


        //Calculate total to pay
        double totalToPay = ((citizenFinancialInformation.getTotalIncome() * deductionPercentage)
                - citizenFinancialInformation.getTotalDeductions()) * declarationPercentage
                + socialAmount * retefuentePercentage - reliefAmount;

        citizenFinancialInformation.setTotalValueTaxable(totalToPay);
        System.out.println("Total Value Taxable calculated");
        return new Double(totalToPay).doubleValue();
    }
}
