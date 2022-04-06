package day09_IfStatements;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        if(num1%3==0 && num1%5 != 0){
            System.out.println("FIN");
        }
        else if(num1%3!=0 && num1%5 == 0){
            System.out.println("RA");
        }
        else if(num1%3==0 && num1%5 == 0){
            System.out.println("FINRA");
        }
        else{
            System.out.println("the number can not dividable by both 3 and 5");
        }
    }
}
