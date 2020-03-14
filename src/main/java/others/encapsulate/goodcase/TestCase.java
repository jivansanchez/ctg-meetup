package others.encapsulate.goodcase;

import others.encapsulate.dto.CitizenFinancialInformation;

import java.util.HashMap;
import java.util.Map;

public class TestCase {

    public static void main(String[] args) {
        CitizenFinancialInformation pabloFinancialInformation = new
                CitizenFinancialInformation("123456789", "Pablo", 2019, 100000d, 35000d, 200000d, 50000d);

        Map<String, TaxVerification> taxVerificationBeans = getVerificationsBeans();
        Map<String, TaxCalculation> taxCalculationnBeans = getVCalculationBeans();

        //Verify if citizen has to present Rent Tax declaration for the year
        if (!taxVerificationBeans.get("presentation").validateTax(pabloFinancialInformation)) {
            return;
        }

        //Verify if total deductions for the year are the value expected or less
        if (!taxVerificationBeans.get("deduction").validateTax(pabloFinancialInformation)) {
            return;
        }

        //after deductions the income should be greater than 200000 to pay the tax
        if (!taxVerificationBeans.get("afterDeductions").validateTax(pabloFinancialInformation)) {
            return;
        }

        //Calculate total to pay
        taxCalculationnBeans.get("paymentCalculation").calculate(pabloFinancialInformation);

        //Apply additional charges
        taxCalculationnBeans.get("additionalCharges").calculate(pabloFinancialInformation);

        System.out.println("Total to pay for Pablo is .... " + pabloFinancialInformation.getFinalValueTaxable());
    }

    public static Map<String, TaxVerification> getVerificationsBeans(){
        Map<String, TaxVerification> mapBeans = new HashMap<>();
        mapBeans.put("presentation", new TaxPresentVerification());
        mapBeans.put("deduction", new TaxDeductionsVerification());
        mapBeans.put("afterDeductions", new TaxAfterDeductionsVerification());

        return mapBeans;
    }

    public static Map<String, TaxCalculation> getVCalculationBeans(){
        Map<String, TaxCalculation> mapBeans = new HashMap<>();
        mapBeans.put("paymentCalculation", new TaxPaymentCalculation());
        mapBeans.put("additionalCharges", new TaxAdditionalsCalculation());

        return mapBeans;
    }
}
