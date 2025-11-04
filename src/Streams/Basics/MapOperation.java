package Streams.Basics;

import java.util.*;
import java.util.stream.*;

public class MapOperation {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Map<String, Integer> map1 = new HashMap<>(Map.of("Apple", 4, "Orange", 5,
                "Kiwi", 6,
                "Grapes", 7));

        System.out.println(map1);

        map1.keySet().forEach(System.out::println);
        map1.values().forEach(System.out::println);
        map1.forEach((key, value) -> System.out.println("key: " + key + " & value: " + value));

        // create a frequency map from list
        List<Integer> list = List.of(1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6,6, 6);

        LinkedHashMap<Integer, Long> freqMap = list.stream()
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));

        System.out.println(freqMap);

        // map() function in stream

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "guv", "apple");
        List<String> digits = Arrays.asList("11", "12", "44", "56", "88", "90");



        // get length of each string
        List<Integer> lenList = fruits.stream()
                .peek(word -> System.out.print("word " + word + " "))
                .map(String::length)
                .collect(Collectors.toList());

        LinkedHashMap<String, Integer> wordWithLen = fruits.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        String::length,
                        (oldVal, newVal) ->newVal,
                        LinkedHashMap::new
                ));

        System.out.println("  wordwithlen = " +wordWithLen);

        System.out.println("Reverse lenWithWord");

        TreeMap<Integer, List<String>> lenWithWord = fruits.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()
                ));

        System.out.println("Reverse lenWithWord " + lenWithWord);

        // Convert list<string> to list<integer>
        List<Integer> result = digits.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(lenList);
        System.out.println(result);

    }
}
