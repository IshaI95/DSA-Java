package Streams.Advance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElementWordFromList {

    public static void main(String[] args) {

        List<String> strings= Arrays.asList("AA", "BB", "CC", "AA", "CC", "AA", "DD", "BB");

        Map<String, Long> map = strings.stream()
                .filter(x -> Collections.frequency(strings, x)>1) // can be removed if we want
                // all strings count not only duplicate strings count
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((str,count) -> System.out.println("String: " + str + " count: " + count));

    }
}
