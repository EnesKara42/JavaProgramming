package day11_Switch_Scanner;
import java.util.Arrays;
public class http {
    public static void main(String[] args) {
        int[] statusCode1 = {200, 201, 202, 301, 303, 304, 307, 400, 401, 403, 404, 410, 500, 503};

        for (int i = 0; i <= 13; i++) {

            int statusCode = statusCode1[i];
            switch (statusCode) {
                case 200:
                    System.out.println("OK");
                    break;
                case 201:
                    System.out.println("Created");
                    break;
                case 202:
                    System.out.println("Accepted");
                    break;
                case 301:
                    System.out.println("Moved Permanently");
                    break;
                case 303:
                    System.out.println("See Other");
                    break;
                case 304:
                    System.out.println("Not Modified");
                    break;
                case 307:
                    System.out.println("Temporary Redirect");
                    break;
                case 400:
                    System.out.println("Bad Request");
                    break;
                case 401:
                    System.out.println("Unauthorized");
                    break;
                case 403:
                    System.out.println("Forbidden");
                    break;
                case 404:
                    System.out.println("Not Found");
                    break;
                case 410:
                    System.out.println("Gone");
                    break;
                case 500:
                    System.out.println("Internal Server Error");
                    break;
                case 503:
                    System.out.println("Service Unavailable");
                    break;
                default:
                    System.out.println("wrong input");

            }
            String result = (statusCode == 200) ? "OK" : (statusCode == 201) ? "Created" : (statusCode == 202) ? "Accepted" : (statusCode == 301) ? "Moved Permanently" : (statusCode == 303) ? "See Other" : (statusCode == 304) ? "Not Modified" : (statusCode == 307) ? "Temporary Redirect" : (statusCode == 400) ? "Bad Request" : (statusCode == 401) ? "Unauthorized" : (statusCode == 403) ? "Forbidden" : (statusCode == 404) ? "Not Found" : (statusCode == 410) ? "Gone" : (statusCode == 500) ? "Internal Server Error" : (statusCode == 503) ? "Service Unavailable" : "wrong input";
            System.out.println("result = " + result);
        }
    }

}