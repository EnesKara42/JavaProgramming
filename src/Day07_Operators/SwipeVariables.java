package Day07_Operators;

public class SwipeVariables {
    public static void main(String[] args) {
        int a=70;
        int b=95;
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
