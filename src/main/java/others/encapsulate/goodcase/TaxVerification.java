package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public interface TaxVerification {

    /**
     *
     * @param citizenFinancialInformation
     * @return
     */
    Boolean validateTax(CitizenFinancialInformation citizenFinancialInformation);
}
