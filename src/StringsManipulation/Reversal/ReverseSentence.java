package StringsManipulation.Reversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSentence {

    public static void main(String[] args) {

        StringBuilder reverse = new StringBuilder();

        String str = "  Java   is great language to learn ";

        // replace one or more whitespace character with single space
        // and trim leading and trailing whitespace
        str = str.replaceAll("\\s+", " ").trim();

        List<String> strList = Arrays.asList(str.split(" "));

        System.out.println(str);
        System.out.println(strList);

        int n = strList.size();

        for(int i=n-1;i>=0;i--) {
            reverse.append(strList.get(i));
            if(i>0) {
                reverse.append(" ");
            }
        }

        System.out.println(reverse.toString());

    }
}
