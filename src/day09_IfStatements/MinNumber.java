package day09_IfStatements;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("Minimum number between "+num2+" and "+num1+" is "+(num2+1));
        }
        if(num1<num2){
            System.out.println("Minimum number between "+num1+" and "+num2+" is "+(num1+1));
        }
        if(num1==num2){
            System.out.println(num2+" and "+num1+" is equal");
        }


    }
}