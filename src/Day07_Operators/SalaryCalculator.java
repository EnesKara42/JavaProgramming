package Day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double weeklyHours=45;
        double hourlyRate=50;
        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTaxRate=salaryBeforeTax*0.06;
        double federalTaxRate=salaryBeforeTax*0.26;
        double totalTax=stateTaxRate+federalTaxRate;
        double netIncome=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: "+salaryBeforeTax);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);
    }
}
