package day09_IfStatements;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isMarried=scanner.nextBoolean();
        int salary= scanner.nextInt();
        if(isMarried==true){
            if(salary>130000){
                salary=salary-(salary/100*30);
                System.out.println("salary = " + salary);
            }
            else if(salary>=100000 && salary<=130000){
                salary=salary-(salary/100*25);
                System.out.println("salary = " + salary);
            }
            else if(salary>=80000 && salary<100000){
                salary=salary-(salary/100*20);
                System.out.println("salary = " + salary);
            }
            else if(salary<80000 ){
                salary=salary-(salary/100*15);
                System.out.println("salary = " + salary);
            }

        }
        if(isMarried==false){
            if(salary>130000){
                salary=salary-(salary/100*35);
                System.out.println("salary = " + salary);
            }
            else if(salary>=100000 && salary<=130000){
                salary=salary-(salary/100*30);
                System.out.println("salary = " + salary);
            }
            else if(salary>=80000 && salary<100000){
                salary=salary-(salary/100*25);
                System.out.println("salary = " + salary);
            }
            else if(salary<80000 ){
                salary=salary-(salary/100*20);
                System.out.println("salary = " + salary);
            }

        }

    }
}
