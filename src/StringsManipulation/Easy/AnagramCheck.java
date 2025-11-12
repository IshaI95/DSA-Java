package StringsManipulation.Easy;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

//        String s1 = "hello";
//        String s2 = "heliu";

        s1 = s1.replaceAll("\\s+", "").trim();
        s2 = s2.replaceAll("\\s+", "").trim();

        if(s1.length()!=s2.length()) return;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }


}
