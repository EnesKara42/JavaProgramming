package day09_IfStatements;

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String message;
        if(num1>90){
            message ="Your tank is full";
        }
        else if(num1>80){
            message ="Still okay";
        }
        else if(num1>70){
             message ="Don't go too far";
        }
        else if(num1>60){
            message ="Start to head back";
        }
        else if(num1>50){
            message ="Be careful now you at at 50%";
        }
        else{
            message ="You input wrong number";
        }
        System.out.println(message);
    }
}
