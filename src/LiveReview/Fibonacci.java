package LiveReview;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
          /*
        noun: Fibonacci sequence
a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 Write a program to print
		 Fibonacci series of n terms
		 where n is declared by user :
		 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		This is a example of Fibonacci series of 6 terms
		term number		0	1	2	3	4	5	6  7
		Actual value	0, 	1, 	1, 	2, 	3, 	5, 	8  13
				 		  num1	  num2	   sum
		iteration 1 		0 	+	1	=	1
		iteration 2			1   +   1	=	2
		iteration 3			1   +   2	=	3
		iteration 4			2   +   3	=	5
		iteration 5			3	+	5	=	8
		iteration 6         5   +   8   =   13
		.........
         */
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();

        int k=0;
        int j=1;
        int m=0;


        for(int i=1;i<=n;i++){

        j=k+j;
        k=k+j;



        }
        if(n%2==0){
            System.out.println("m = " + m);
        }
        else{
            System.out.println("k = " + k);
        }

    }
}
