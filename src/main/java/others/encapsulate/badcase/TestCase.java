package others.encapsulate.badcase;

import others.encapsulate.dto.CitizenFinancialInformation;

public class TestCase {

    public static void main(String[] args) {
        CitizenFinancialInformation pabloFinancialInformation = new
                CitizenFinancialInformation("123456789", "Pablo", 2019, 100000d, 40000d, 200000d, 50000d);

        //Verify if citizen has to present Rent Tax declaration for the year
        if (!(pabloFinancialInformation.getTotalIncome() > 50000d)) {
            System.out.println(pabloFinancialInformation.getCitizenName() + " has not to present Rent declaration ");
            return;
        }

        //Verify if total deductions for the year are the value expected or less
        if ((pabloFinancialInformation.getTotalIncome() * 0.4) > pabloFinancialInformation.getTotalDeductions()) {
            System.out.println(" Total deductions has to be recalculated ");
            return;
        }

        //after deductions the income should be greater than 200000 to pay the tax
        if (((pabloFinancialInformation.getTotalIncome() * 0.6) - pabloFinancialInformation.getTotalDeductions())
            >= 20000d) {
            System.out.println("Pablo has to pay the rent tax.");
        } else {
            System.out.println("Pablo has to present the rent tax, but npt to pay");
            return;
        }

        //Calculate total to pay
        double totalToPay = ((pabloFinancialInformation.getTotalIncome() * 0.6)
                - pabloFinancialInformation.getTotalDeductions()) * 0.8 + 1200 * 0.8 - 4000;

        //Apply additional payments, admon charges, fuel charges, etc, etc, etc, etc
        totalToPay = totalToPay + 100 + 10 + 12;

        System.out.println("Total to pay for Pablo is .... " + totalToPay);
    }
}
