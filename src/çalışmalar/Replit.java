import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {


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
        String hasLicence=scan.next();
        if(hasLicence.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        scan.nextLine();

        System.out.println("Enter your zip code");

        String zipCode= scan.nextLine();

        if(zipCode.equals("20910")|| zipCode.equals("20740") ){
            premium+=60;
        }else if(zipCode.equals("22102")|| zipCode.equals("22103")){
            premium+=30;
        }else{
            premium+=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership= scan.nextLine();

        if(vehicleOwnership.equalsIgnoreCase("Owned")){
            premium+=10;
        } else{
            premium+=20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage= scan.nextLine();

        if(vehicleOwnership.equalsIgnoreCase("Business")){
            premium+=50;
        }else if (vehicleOwnership.equalsIgnoreCase("Pleasure")){
            premium+=10;
        }  else if (vehicleOwnership.equalsIgnoreCase("Commute")){
            premium+=20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool=scan.nextInt();
            premium+=daysDrivenToWorkOrSchool*5;

            scan.nextLine();
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool=scan.nextInt();
            premium+=milesToWorkOrSchool;
        }

        System.out.println("How old are you?");
        int age= scan.nextInt();

        if (age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        } else if(age<18){
            premium*=20;
        }else if(age<=21){
            premium*=6;
        }else if(age<25){
            premium*=2;
        }

        System.out.println("How many years you've been driving?");
        int experienceYear = scan.nextInt();

        if (experienceYear>0 && age-experienceYear>=16){
            premium-=experienceYear*5;

        }else{
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Have you had any accidents in the last 5 years?");

        String accident = scan.next();

        if(accident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();

            premium+=premium*accidentsAmount*0.2;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");

        continuousInsurance = scan.next();

        if(accident.equalsIgnoreCase("no")){
            premium*=2;
        }
        System.out.println("What is the highest level of education you have completed?");

        scan.nextLine();
        education = scan.nextLine();

        if(education.equalsIgnoreCase("phd")||education.equalsIgnoreCase("bachelors")||education.equalsIgnoreCase("masters")){
            premium-=premium*0.05;
        } else if (education.equalsIgnoreCase("doctors")){
            premium-=premium*0.10;
        }else if (education.equalsIgnoreCase("less than high school")){
            premium+=premium*0.05;
        }

        referenceNumber= (name.substring(0,2)+age+name.substring(name.length()-2)+zipCode+education.replace(" ", "")).toUpperCase();

        System.out.println(name+ ", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        System.out.println("Reference number: "+referenceNumber);

    }
}