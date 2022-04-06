package çalışmalar;

import java.util.*;


// Java Program to find n'th fibonacci Number

class fibonacci4 {

    static int fib(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double sonuc = Math.round(Math.pow(phi, n) / Math.sqrt(5));
        int k = (int) sonuc;
        return k;
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 45;
        System.out.println(fib(n));
    }
}



