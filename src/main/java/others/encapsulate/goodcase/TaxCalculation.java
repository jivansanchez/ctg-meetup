package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public interface TaxCalculation {

    /**
     *
     * @param citizenFinancialInformation
     * @return
     */
    Double calculate(CitizenFinancialInformation citizenFinancialInformation);
}
