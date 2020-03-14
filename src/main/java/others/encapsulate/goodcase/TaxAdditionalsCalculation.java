package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public class TaxAdditionalsCalculation implements TaxCalculation {

    @Override
    public Double calculate(CitizenFinancialInformation citizenFinancialInformation) {

        Double finalAdditionalCharged = new ConfigurationFileReader().getAdditionalValuees();
        citizenFinancialInformation.setFinalValueTaxable(citizenFinancialInformation.getTotalValueTaxable() + finalAdditionalCharged);

        return finalAdditionalCharged;
    }
}
