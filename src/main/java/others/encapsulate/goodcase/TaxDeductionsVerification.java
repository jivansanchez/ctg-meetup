package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public class TaxDeductionsVerification implements TaxVerification {

    @Override
    public Boolean validateTax(CitizenFinancialInformation citizenFinancialInformation) {

        Double deductionPercentage = new ConfigurationFileReader().getConfiguratinValue("deductionPercentage");

        if ((citizenFinancialInformation.getTotalIncome() * deductionPercentage) > citizenFinancialInformation.getTotalDeductions()) {
            System.out.println("Total deductions are accepted");
            return Boolean.TRUE;
        } else {
            System.out.println("Total deductions has to be recalculated");
            return Boolean.FALSE;
        }
    }
}
