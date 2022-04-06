package day09_IfStatements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        if(num1==1){

            System.out.println("Hello, thank for your call");
        }
        else if(num1==2){

            System.out.println("Hola, gracias para llamar");
        }
        else if(num1==3){

            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }
        else if(num1==4){

            System.out.println("Privet, spasibo za vash zvonok" );
        }
        else if(num1==5){

            System.out.println("Merci ,pour votre appel");
        }
        else{
            System.out.println("You input wrong type of number");
        }
    }
}