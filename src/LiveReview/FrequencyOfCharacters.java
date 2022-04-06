package LiveReview;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FrequencyOfCharacters {
/*
What is pseudocode?  In computer science, pseudocode is a plain language description of the steps in an algorithm or another system. Pseudocode often uses structural conventions of a normal programming language, but is intended for human reading rather than machine reading.
- Iterate over given string with an outer loop so that you can get each get char
- I need an inner loop to itarate again to compare that particular char with the rest of the string
-- Empty Bucket : this will hold each char and its frequency   String result = ""

 */

    public static void main(String[] args) {
        String s="aabcccd";
        int distinct = 0 ;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(i)==s.charAt(j))
                {
                    distinct++;

                }
            }
            System.out.print(s.charAt(i)+""+distinct);
            String d=String.valueOf(s.charAt(i)).trim();

            s=s.replaceAll(d,"");

            distinct = 0;
            i--;

        }


    }

}