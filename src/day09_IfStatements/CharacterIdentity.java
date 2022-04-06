package day09_IfStatements;
import java.util.Scanner;
public class CharacterIdentity {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int a=scanner.nextInt();
        char c = (char) a;
        System.out.println("c = " + c);
        if(a>=32 && a<=47 || a>=58 && a<=64 || a>=91 && a<=96 || a>=123 && a<=127){
            System.out.println("it is special character");
        }
        else if(a>=48 && a<=57){
            System.out.println("it is digit character");
        }
        else if(a>=65 && a<=90 || a>=97 && a<=122 ){
            System.out.println("it is alphabet character");
        }
        else{
            System.out.println("you input wrong");
        }

    }
}
