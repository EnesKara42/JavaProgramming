package day09_IfStatements.day10_NestedIf;

public class Loans {
    public static void main(String[] args) {
        int salary=75000;
        int creditScore=550;
        String result=(salary>60000 && creditScore>650)?"Loan Approved":"Loan Denied";
        System.out.println("result = " + result);
    }
}
