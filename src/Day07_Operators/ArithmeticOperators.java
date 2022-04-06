package Day07_Operators;
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        System.out.println("input first number");
        int num1=scanner.nextInt();
        System.out.println("input second number");
        int num2=scanner.nextInt();

        int division= num1/num2;
        int remainder=num1%num2;
        System.out.println(""+num1+" divide by "+num2+" is equal to "+division+" with a remainder of "+remainder+"");
    }
}
