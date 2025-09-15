package Streams.Advance;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) {
        String str = "luv is always popular";

        Set<Character> set = new HashSet<>();

        // 1st approach, sometimes not working
        Character result = str.chars()
                .mapToObj( c -> (char) c)
                .filter(s -> !set.add(s))
                .findFirst()
                .orElse(null);

        System.out.println("result is " + result);

        //2nd approach
        Character answer = str.chars()
                .mapToObj(c -> Character.toLowerCase((char)c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);

        System.out.println("answer = " + answer);
    }
}
