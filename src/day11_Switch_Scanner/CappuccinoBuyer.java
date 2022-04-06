package day11_Switch_Scanner;

import java.util.Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String size=s.next();

        if(size.equals("tall")){
            System.out.println("price is $3.69\n 90 calories");
        }
        else if(size.equals("grande")){
            System.out.println("price is $3.99\n 120 calories");
        }
        else if(size.equals("venti")){
            System.out.println("price is $4.29\n 150 calories");
        }
        else{
            System.out.println("wrong input");
        }


        switch(size){
            case "tall":
                System.out.println("price is $3.69\n 90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99\n 120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29\n 150 calories");
                break;
            default:
                System.out.println("invalid input");
        }

        if(size.equals("tall")|| size.equals("grande")|| size.equals("venti")){
            switch (size){
                case "tall":
                    System.out.println("price is $3.69\n 90 calories");
                    break;
                case "grande":
                    System.out.println("price is $3.99\n 120 calories");
                    break;
                case "venti":
                    System.out.println("price is $4.29\n 150 calories");
                    break;
                default:
                    System.out.println("invalid input");
            }


        }

    }
}
