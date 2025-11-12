package StringsManipulation.Reversal;

import java.util.ArrayList;
import java.util.*;

public class ReverseEachWordInSentence {

    public static void main(String[] args) {
        String str = "java is a very popular language";
        ArrayList<String> result = new ArrayList<String>();

        str = str.replaceAll("\\s+", " ").trim();
        List<String> list = Arrays.asList(str.split(" "));

        for(int i=0;i<list.size();i++) {

            String st = list.get(i);
            char[] arr = st.toCharArray();
            int s=0;
            int e= st.length() - 1;

            while(s<e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

            result.add(new String(arr));
        }

        System.out.println("result is " + result);
        String ans = String.join(" ", result);
        System.out.println("ans = " + ans);
    }


}
