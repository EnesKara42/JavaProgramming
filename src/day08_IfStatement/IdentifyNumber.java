package day08_IfStatement;
import java.util.Scanner;
public class IdentifyNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number");
        int num1=scanner.nextInt();
        if(num1>0){
            boolean isPositive=num1>0;
            System.out.println("isPositive = " + isPositive);
        }
        if(num1<0){
            boolean isNegative=num1<0;
            System.out.println("isNegative = " + isNegative);
        }
        if(num1==0){
            boolean isZero=num1==0;
            System.out.println("isZero = " + isZero);
        }

    }
}
