package day09_IfStatements.day10_NestedIf;

import java.util.Scanner;

public class Http {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int [] statusCode1={200,201,202,301,303,304,307,400,401,403,404,410,500,503};

        for(int i=0;i<=13;i++) {

            int statusCode=statusCode1[i];
            String result = (statusCode == 200) ? "OK" : (statusCode == 201) ? "Created" : (statusCode == 202) ? "Accepted" : (statusCode == 301) ? "Moved Permanently" : (statusCode == 303) ? "See Other" : (statusCode == 304) ? "Not Modified" : (statusCode == 307) ? "Temporary Redirect" : (statusCode == 400) ? "Bad Request" : (statusCode == 401) ? "Unauthorized" : (statusCode == 403) ? "Forbidden" : (statusCode == 404) ? "Not Found" : (statusCode == 410) ? "Gone" : (statusCode == 500) ? "Internal Server Error" : (statusCode == 503) ? "Service Unavailable" : "wrong input";
            System.out.println("result = " + result);
        }
    }
}
