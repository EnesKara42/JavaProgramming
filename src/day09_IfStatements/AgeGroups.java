package day09_IfStatements;

import java.util.Scanner;

public class AgeGroups {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 1 && age <= 2) {
            System.out.println("You are infant");
        }
        if (age >= 3 && age <= 5) {
            System.out.println("You are toddler");
        }
        if (age >= 6 && age <= 9) {
            System.out.println("You are kid");
        }
        if (age >= 10 && age <= 12) {
            System.out.println("You pre teen");
        }
        if (age >= 13 && age <= 17) {
            System.out.println("You are teenager");
        }
        if (age >= 18 && age <= 20) {
            System.out.println("You are young adult");
        }
        if (age >= 21 && age <= 39) {
            System.out.println("You are adult");
        }
        if (age >= 40 && age <= 49) {
            System.out.println("You are Young Middle-Aged Adult");
        }
        if (age >= 50 && age <= 54) {
            System.out.println("You are Middle-Aged Adult");
        }
        if (age >= 55 && age <= 64) {
            System.out.println("You are Very Young Senior Citizen");
        }
        if (age >= 65 && age <= 74) {
            System.out.println("You are Young Senior Citizen");
        }
        if (age >= 75 && age <= 84) {
            System.out.println("You are Senior Citizen");
        }
        if (age >= 85) {
            System.out.println("You are Old Senior Citizen");
        }


    }
}
