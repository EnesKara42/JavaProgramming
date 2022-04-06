package day09_IfStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        String mathOperator = myObj.nextLine();  // Read user input


       if(mathOperator.equals("/")){
         int solution=num1/num2;
           System.out.println("solution = " + solution);
       }
        else if(mathOperator.equals("%")){
            int solution=num1%num2;
            System.out.println("solution = " + solution);
        }
        else if(mathOperator.equals("*")){
            int solution=num1*num2;
            System.out.println("solution = " + solution);
        }
        else if(mathOperator.equals("-")){
            int solution=num1-num2;
            System.out.println("solution = " + solution);
        }
        else if(mathOperator.equals("+")){
            int solution=num1+num2;
            System.out.println("solution = " + solution);
        }
        else{
           System.out.println("You input wrong type of mathOperator");
       }

    }
}