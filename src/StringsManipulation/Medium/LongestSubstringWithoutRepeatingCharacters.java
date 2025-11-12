package StringsManipulation.Medium;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "abcabcbb";
        int maxLen = 0;
        int left = 0;
        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right=0;right<str.length();right++) {

            char ch = str.charAt(right);

            if(map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            int len = right - left + 1;

            if(len>maxLen) {
                maxLen = len;
                start = left;
            }
        }

        System.out.println("Max len = " + maxLen);

        System.out.println("Max len substring = " + str.substring(start,start+maxLen));
    }
}
