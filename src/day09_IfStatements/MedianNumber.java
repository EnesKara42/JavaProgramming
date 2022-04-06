package day09_IfStatements;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1<num2 && num2<num3 || num3<num2 && num2<num1){
            System.out.println("num2 is median number= " + num2);
        }



        if(num1<num3 && num3<num2 || num2<num3 && num3<num1){
            System.out.println("num3 is median number= " + num3);
        }



        if(num2<num1 && num1<num3 || num3<num1 && num1<num2){
            System.out.println("num1 is median number= " + num1);
        }

    }
}
