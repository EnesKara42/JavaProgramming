package day11_Switch_Scanner;

public class ConvertNumbers {
    public static void main(String[] args) {
        String[]numbers={"0","1","2","3","4","5","6","7","8","9"};
        String[]words={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String result="yara";
        for(int i=0;i<=9;i++){
           numbers[i]=words[i];
            result=(numbers[i].equals(words[i]))? words[i]: " ";
            System.out.println(result);
        }

    }
}
