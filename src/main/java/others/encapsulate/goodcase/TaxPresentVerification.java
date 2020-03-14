package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public class TaxPresentVerification implements TaxVerification {

    @Override
    public Boolean validateTax(CitizenFinancialInformation citizenFinancialInformation) {

        Double presetationThreshold = new ConfigurationFileReader().getConfiguratinValue("incomeMinThreshold");

        if (citizenFinancialInformation.getTotalIncome() > presetationThreshold) {
            System.out.println("The Citizen "+ citizenFinancialInformation.getCitizenName() + " has to present the Tax");
            return Boolean.TRUE;
        } else {
            System.out.println("The Citizen "+ citizenFinancialInformation.getCitizenName() + " has not to present the Tax");
            return Boolean.FALSE;
        }
    }
}
