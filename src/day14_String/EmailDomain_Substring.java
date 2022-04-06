package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        // domain:
        int beginningIndex = email.indexOf("@")+1 ; //beginningIndex = 13
        int endingIndex = email.lastIndexOf("."); //endingIndex = 18


        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println("------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             0123456789
        //
        String s1 = str1.substring(0, 10+1) ;  // Java is fun

        int beg = str1.indexOf(" J") + 1; //beg = 13
        int end = str1.lastIndexOf(","); //end = 25


        String s2 = str1.substring(beg, end );  //Java is cool


        String s3 = str1.substring(  str1.lastIndexOf("I")  );

        String str2="Ne mutlu Türküm diyene";
        String s4= str2.substring(str2.lastIndexOf("d"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }

}