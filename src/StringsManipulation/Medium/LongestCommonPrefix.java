package StringsManipulation.Medium;

import java.util.*;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        List<String> strs = Arrays.asList("flowers", "flow", "flight");

        int n= strs.size();
        int minLen = Integer.MAX_VALUE;
        int minIdx = -1;
        String ans = "";
        boolean isQualified = true;

        for(int i=0;i<n;i++) {
            if(strs.get(i).length() < minLen) {
                minLen = strs.get(i).length();
                minIdx = i;
            }
        }

        System.out.println("minLen = " + minLen);

        String s = strs.get(minIdx);

        System.out.println("min len string = " + s);

        for(int i=0;i<minLen;i++) {
            char ch = s.charAt(i);
            for(int j=0;j<n;j++) {
                if(strs.get(j).charAt(i) != ch) {
                    isQualified = false;
                    break;
                }
            }

            if(isQualified) ans = ans + ch;

        }

        System.out.println("ans = " + ans);
    }
}
