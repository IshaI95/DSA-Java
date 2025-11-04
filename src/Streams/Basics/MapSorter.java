package Streams.Basics;

import java.util.*;
import java.util.stream.*;

public class MapSorter {

    public static void main(String[] args) {
        Map<String, Integer> fruits = Map.of(
                "apple", 5,
                "kiwi", 3,
                "banana", 4,
                "grapes", 2,
                "litchi", 3,
                "papaya", 2
        );

        // sort map by keys asc
        Map<String, Integer> sortedByKey = fruits.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2,
                        LinkedHashMap::new
                ));

        System.out.println("sortedByKey = " + sortedByKey);

        //sortedByKeyReverse

        Map<String, Integer> sortedByKeyReverse= fruits.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e2,
                        LinkedHashMap::new
                ));

        System.out.println("sortedByKeyReverse = " + sortedByKeyReverse);

        // sortByvalue
        Map<String,Integer> sortByValue = fruits.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e2,
                        LinkedHashMap::new
                ));

        System.out.println("sortByValue= " + sortByValue);

        Map<String,Integer> sortByValueReversed = fruits.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("sortByValueReversed = " + sortByValueReversed);

        // sort first by key and then value

        Map<String,Integer> sortByKeyThenValue = fruits.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("sortByKeyThenValue: " + sortByKeyThenValue );

        //Extract only keys list or values lis from sorted entries

        List<String> sortedKeysByValue = fruits.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("sortedKeysByValue = " + sortedKeysByValue);

        List<Map.Entry<String, Integer>> sortedByValueThenKey = fruits.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .toList();

        sortedByValueThenKey.forEach(entry ->
                System.out.println(entry.getKey() + " = " + entry.getValue()));
    }

}
