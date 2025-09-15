package Streams.Advance;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "lava is always popular";

        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .get();

        String input = "smiss";

        Character result1 = input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .orElse(null); // unsure about the input always contains non repeating
        // char use orelse

        System.out.println(result);

        // 2nd approach
        Character answer = str.chars()
                .mapToObj( c -> Character.toLowerCase((char)c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);

        System.out.println("answer is " + answer);

    }
}
