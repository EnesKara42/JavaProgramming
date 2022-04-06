package Day07_Operators;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input the year");
        int year=scanner.nextInt();
        boolean leapYear=year%4==0;

        System.out.println(year+" is leap year: "+leapYear);
    }
}
