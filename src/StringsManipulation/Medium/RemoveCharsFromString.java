package StringsManipulation.Medium;

import java.util.HashSet;

public class RemoveCharsFromString {

    public static void main(String[] args) {

        String s1 = "computerc";
        String s2 = "cat";

        // Step 1: Store all characters of str2 in a Set
        HashSet<Character> set = new HashSet<>();

        for(char ch:s2.toCharArray()) {
            set.add(ch);
        }

        // Step 2: Build new string using StringBuilder
        StringBuilder sb = new StringBuilder();

        for(char ch: s1.toCharArray()) {
            if(!set.contains(ch)) {
                sb.append(ch);
            }
        }

        System.out.println("result after removing s2 chars from s1 = " + sb.toString());
    }
}
