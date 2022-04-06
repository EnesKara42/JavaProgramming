package LiveReview;

import java.util.Scanner;

public class EncryptPassword {

    /**
     * 5.
     * Given a string password. Encrypt with "x" a given password
     * and print.
     * (do with for loop)
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       String password= scan.nextLine();
       String[]enes=password.split("");
       for(int i=0;i<enes.length;i++){
           System.out.print(enes[i]+"x");
       }

    }
}