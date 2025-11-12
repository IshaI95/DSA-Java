package StringsManipulation.Easy;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

    public static void main(String[] args) {

        String s = "programming";
        s = s.toLowerCase().trim();
        // output -> "progamin"

        LinkedHashSet<Character> set = new LinkedHashSet<Character>();

        for(char c: s.toCharArray()) set.add(c);

        StringBuilder result = new StringBuilder();
        for(char c:set) result.append(c);

        System.out.println(result.toString());
    }
}
