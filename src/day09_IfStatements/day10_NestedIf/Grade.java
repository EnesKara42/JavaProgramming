package day09_IfStatements.day10_NestedIf;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char grade = s.next(".").charAt(0);
        String comment;

        if(grade == 'A' || grade =='B' ||grade == 'C' || grade == 'D' || grade == 'F'){
            if(grade == 'A'){
            comment="excellent";
            }
            else if(grade =='B'){
            comment="great job";
            }
            else if(grade == 'C'){
            comment="good";
            }
            else if(grade == 'D'){
            comment="passed";
            }
            else{
                comment="failed";
            }
        }
        else{
            comment="invalid input";
        }
        System.out.println("comment = " + comment);
    }
}
