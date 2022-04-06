import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name=scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String educationLicense=scan.nextLine();
        if(educationLicense.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipcode=scan.nextInt();
        if(zipcode==20910 || zipcode==20740){
            premium+=60;
        }
        else if(zipcode==22102 || zipcode==22103){
            premium+=30;
        }
        else{
            premium+=50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.next();
        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium+=10;
        }
        else{
            premium+=20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.next();
        if(vehicleUsage.equalsIgnoreCase("business")){
            premium+=50;

        }
        else if(vehicleUsage.equalsIgnoreCase("pleasure")){
            premium+=10;
        }
        else if(vehicleUsage.equalsIgnoreCase("commute")){
            premium+=20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool=scan.nextInt();
            premium=premium+(daysDrivenToWorkOrSchool*5);
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium = premium+milesToWorkOrSchool*1;
        }



        System.out.println("How old are you?");
        int age=scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        else if(age>=16 && age<18){
            premium=premium*20;
        }
        else if(age>=18 && age<=21){
            premium=premium*6;
        }
        else if(age>21 && age<25){
            premium=premium*2;
        }
        System.out.println("How many years you've been driving?");
        int drivingExperience=scan.nextInt();
        if(drivingExperience>0 && age-drivingExperience>=16){
            premium=premium-(drivingExperience*5);
            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents=scan.next();
            if(accidents.equalsIgnoreCase("yes")){
                System.out.println("How many?");
                accidentsAmount=scan.nextInt();
                premium=premium+accidentsAmount*((premium/100)*20);

            }
        }
        else{
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance=scan.next();
        if(continuousInsurance.equalsIgnoreCase("no")){
            premium*=2;
        }
        System.out.println("What is the highest level of education you have completed?");
        scan.nextLine();
        education=scan.nextLine();
        if(education.equalsIgnoreCase("phd") ||education.equalsIgnoreCase("bachelors")||education.equalsIgnoreCase("masters")){
            premium=premium-((premium/100)*5);
        }
        else if(education.equalsIgnoreCase("doctors")){
            premium=premium-((premium/100)*10);

        }
        else if(education.equalsIgnoreCase("Less than High School")){
            premium=premium+((premium/100)*5);
            education = education.replaceAll("\\s", "");

        }
        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        String[]enes=name.split("");
        System.out.println("Reference number: "+enes[0].toUpperCase()+enes[1].toUpperCase()+age+enes[enes.length-2].toUpperCase()+enes[enes.length-1].toUpperCase()+zipcode+education.toUpperCase());




















    }
}