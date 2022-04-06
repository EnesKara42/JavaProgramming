package day06_PrimitiveTypeCastings;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        //larger to smaller
        int b=35;
        byte a=(byte)b;

        double dval=32000.33;
        short number= (short) dval;

        //smaller to larger
        short number1=32000;
        long number2=number1;


        System.out.println("a = " + a);
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
    }
}
