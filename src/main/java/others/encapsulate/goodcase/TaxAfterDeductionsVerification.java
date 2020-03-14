package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public class TaxAfterDeductionsVerification implements TaxVerification {

    @Override
    public Boolean validateTax(CitizenFinancialInformation citizenFinancialInformation) {

        Double deductionCalculationPercentage = new ConfigurationFileReader().getConfiguratinValue("deductionCalculationPercentage");
        Double minThresdholdAfterDeductions = new ConfigurationFileReader().getConfiguratinValue("minThresdholdAfterDeductions");

        if (((citizenFinancialInformation.getTotalIncome() * deductionCalculationPercentage)
                - citizenFinancialInformation.getTotalDeductions()) >= minThresdholdAfterDeductions) {
            System.out.println("Pablo has to pay the rent tax.");
            return Boolean.TRUE;
        } else {
            System.out.println("Pablo only has to present the rent tax.");
            return Boolean.FALSE;
        }
    }
}
