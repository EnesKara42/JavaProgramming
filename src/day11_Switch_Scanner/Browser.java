package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String[]browser={"chrome", "firefox", "opera", "safari", "edge"};
        for(int i=0;i<=4;i++){
            String browser1=browser[i];
            if(browser1.equals("chrome") ||browser1.equals("firefox") ||browser1.equals("opera") ||browser1.equals("safari") ||browser1.equals("edge") ){
                if(browser1.equals("chrome")){
                    System.out.println(browser[i]+" is selected");
                }
                else if(browser1.equals("firefox")){
                    System.out.println(browser[i]+" is selected");
                }
                else if(browser1.equals("opera")){
                    System.out.println(browser[i]+" is selected");
                }
                else if(browser1.equals("safari")){
                    System.out.println(browser[i]+" is selected");
                }
                else{
                    System.out.println(browser[i]+" is selected");
                }

            }
            else{
                System.out.println("wrong input");
            }
        }
    }
}
