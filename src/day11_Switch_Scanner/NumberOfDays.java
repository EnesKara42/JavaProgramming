package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int month= 12;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int a=0;
        int b=0;
        int c=0;


        for(int i=0;i<=11;i++) {
            if (month <= 12 && month >= 0) {
                if (days[i] == 28) {
                    a++;
                    System.out.println((i + 1) + ".month has 28 days");
                } else if (days[i] == 30) {

                    b++;
                    System.out.println((i + 1) + ".month has 30 days");
                } else {
                    c++;
                    System.out.println((i + 1) + ".month has 31 days");
                }

            }

        }
        System.out.println("\n");
        System.out.println(a+" months have 28 days\n"  +b+" months has 30 days\n"  +c+" months have 31 days\n");
    }
}
