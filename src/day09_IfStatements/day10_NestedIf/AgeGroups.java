package day09_IfStatements.day10_NestedIf;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        String ens="enes";
        if(age<21 || age>=21&&age<55 ||age>=55){
            if (age<0 || age>150){
                ens="invalid input";
            }
            else if(age<21){
                ens="teenager";
            }
            else if(age>=21&&age<55){
                ens="adult";
            }
            else{
                ens="senior";
            }
        }
        System.out.println("ens = " + ens);

    }
}
