package day09_IfStatements;

import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        if(time>=8 && time<=23){
            System.out.println("open");
        }
        else if(time==24 || time<8){
            System.out.println("closed");
        }
        else {
            System.out.println("you input wrong number");
        }
    }
}
