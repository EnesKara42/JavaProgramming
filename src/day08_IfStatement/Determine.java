package day08_IfStatement;
import java.util.Scanner;
public class Determine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1= scanner.nextInt();
        if(num1>=1 && num1<=5){
            System.out.println("1-5: Elementary school");
        }
        else if(num1>=6 && num1<=8){
            System.out.println("6-8: Middle school");
        }
        else if(num1>=9 && num1<=12){
            System.out.println("9-12: High school");
        }
        else if(num1>=13 && num1<=16){
            System.out.println("13-16: College");
        }
        else if(num1>=17 && num1<=18){
            System.out.println("17-18: Grad school");
        }
        else{
            System.out.println("you inputed wrong type of number");
        }


    }
}
