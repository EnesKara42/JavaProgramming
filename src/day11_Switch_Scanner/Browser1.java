package day11_Switch_Scanner;

public class Browser1 {
    public static void main(String[] args) {
        String[]browserName={"chrome", "firefox", "opera", "safari", "edge"};

        switch (browserName[0]){
            case "chrome":
                System.out.println("match with chrome");
                break;

            case "firefox":
                System.out.println("match with firefox");
                break;

            case "opera":
                System.out.println("match with opera");
                break;

            case "safari":
                System.out.println("match with safari");
                break;

            case "edge":
                System.out.println("match with edge");
                break;

            default:
                System.out.println("ınvalid browser");

        }

    }
}
