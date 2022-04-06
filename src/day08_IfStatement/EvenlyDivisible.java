package day08_IfStatement;
import java.util.Scanner;
public class EvenlyDivisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        if(num1%2==0){
            System.out.println(num1+ " is divisible by 2: true");
        }
        else{
            System.out.println(num1+ " is divisible by 2: false");
        }
        if(num1%3==0){
            System.out.println(num1+ " is divisible by 3: true");
        }
        else{
            System.out.println(num1+ " is divisible by 3: false");
        }
        if(num1%5==0){
            System.out.println(num1+ " is divisible by 5: true");
        }
        else{
            System.out.println(num1+ " is divisible by 5: false");
        }

    }
}
