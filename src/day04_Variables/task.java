package day04_Variables;
import java.util.Arrays;
import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double side,area,perimeter;
        System.out.print("Please insert the square side value= ");
        side= scanner.nextDouble();
        area=side*side;
        perimeter=4*side;
        System.out.println("square area = " + area);
        System.out.println("square perimeter = " + perimeter );

        double lenght,width,perimeter1,area1;
        System.out.print("\nPlease insert the rectangle lenght value= ");
        lenght=scanner.nextDouble();
        System.out.print("Please insert the rectangle width value= ");
        width=scanner.nextDouble();
        perimeter1=2*(lenght+width);
        area1=lenght*width;
        System.out.println("rectangle area1 = " + area1);
        System.out.println("rectangle perimeter1 = " + perimeter1);

        double dollar,euro,lira, jpy, pound, peso, cad, riyal;
        System.out.print("\nPlease insert that you have how much dollar in your pocket = ");
        dollar=scanner.nextDouble();
        lira=dollar*9.53;
        euro=dollar*0.86;
        jpy=dollar*114.48;
        pound=dollar*0.73;
        peso=dollar*20.30;
        cad=dollar*1.25;
        riyal=dollar*3.75;
        System.out.println(""+dollar+"dollar = "+lira+" lira");
        System.out.println(""+dollar+"dollar = "+euro+" euro");
        System.out.println(""+dollar+"dollar = "+jpy+" jpy");
        System.out.println(""+dollar+"dollar = "+pound+" pound");
        System.out.println(""+dollar+"dollar = "+peso+" peso");
        System.out.println(""+dollar+"dollar = "+cad+" cad");
        System.out.println(""+dollar+"dollar = "+riyal+" riyal");

        double halfDiameter, perimeter2, area2;
        System.out.print("\nPlease insert the half of the diameter = ");
        halfDiameter=scanner.nextDouble();
        perimeter2=2*Math.PI*halfDiameter;
        area2=Math.PI*halfDiameter*halfDiameter;
        System.out.println("perimeter2 = " + perimeter2);
        System.out.println("area2 = " + area2);

        String name, company, jobTitle, employeeId, SSN;
        int age, yearsOfExperience, Salary;
        char gender='M';
        boolean isFullTime,isMarried;
        name="Enes";
        company="Cydeo";
        jobTitle="Software Engineer";
        age=26;
        yearsOfExperience=0;
        isFullTime=true;
        isMarried=false;
        Salary=3000;
        employeeId="436";
        SSN="132-256-635";
        System.out.println("\nname = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("Salary =  "+Salary+"Euro");
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);









    }
}
