package day08_IfStatement;
import java.util.Scanner;
public class Eligible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you?");
        int age= scanner.nextInt();
        boolean isEligible= age>=18;
        if(isEligible){
            System.out.println("isEligible = " + isEligible);
        }
        else{
            System.out.println("isEligible = " + isEligible);
        }
    }
}
