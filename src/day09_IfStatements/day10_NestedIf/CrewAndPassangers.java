package day09_IfStatements.day10_NestedIf;

import java.util.Scanner;

public class CrewAndPassangers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        String ens ;

        if (number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                ens = "20 crew, 30 passengers";
            }
            else if (number == 75) {
                ens = "25 crew, 50 passengers";
            }
            else {
                ens = "30 crew, 70 passengers";
            }
        }
        else {
            ens = "invalid input";
        }
        System.out.println("ens = " + ens);
    }

}

