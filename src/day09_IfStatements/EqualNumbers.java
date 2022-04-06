package day09_IfStatements;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
       /* declare 3 numbers n1, n2, n3
        if all are equal ==> print "all equal"
        if only n1 and n2 are equal  =>print  "n1&n2 are equal"
        if only n2 and n3 are equal ==>print "n2&n3 are equal"
        if only n3 and n1 are qual ==>print "n3&n1 are equal"
        if none of them are euqal ==> none of them are equal
*/
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("all number are equal");

        }
        else if(num1==num2 && num2!=num3){
            System.out.println("num1 equal to num2");
        }
        else if(num1!=num2 && num2==num3){
            System.out.println("num2 equal to num3");
        }
        else if(num1==num3 && num2!=num3){
            System.out.println("num1 equal to num3");
        }
        else{
            System.out.println("none of them equal");
        }


    }
}
