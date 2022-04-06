package day09_IfStatements.day10_NestedIf;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input your grade level");
        byte grade=scanner.nextByte();
        String gradeLevel="y";

        if(grade>=1 && grade<=18){
            if(grade<=5){
                 gradeLevel="Elementary School";
            }

            else if(grade>=6 && grade<=8){
              gradeLevel="Middle school";
            }
            else if(grade>=9 && grade<=12){
                 gradeLevel="High school";
            }
            else if(grade>=13 && grade<=16){
                  gradeLevel="College";
            }
            else if(grade>=17 && grade<=18){
                 gradeLevel="Grad School";
            }



        }
        else{
            gradeLevel="Invalid input";
        }
        System.out.println("gradeLevel = " + gradeLevel);
    }
}
