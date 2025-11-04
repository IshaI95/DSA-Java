package Streams.Basics;
import java.util.*;
import java.util.stream.*;
public class Sorter {

    public static void main(String[] args) {


        // natural order
        List<Integer> nums = List.of(65, 50, 80, 99, 5, 88, 30, 22, 53, 101, 95);

        List<Integer> ascList = nums.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("ascList = " + ascList);

        // reverse order
        List<Integer> descList = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("descList = " + descList);

        // sort strings asc and dec
        List<String> words = List.of("hello", "ananya", "hello", "your", "what", "is", "your", "taste", "the");

        List<String> ascWords = words.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> descWords = words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("ascWords = " + ascWords);
        System.out.println("descWords = " + descWords);

        // compare strings by length

        List<String> strByLenList = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        Set<String> uniqueList = words.stream()
                        .collect(Collectors.toSet());

        // maintain insertion order
        Set<String> uniqueList1 = words.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        // maintain sorted order
        Set<String> uniqueList2 = words.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("words = " + words);
        System.out.println("strByLenList = " + strByLenList);
        System.out.println("randomOrderSet = " + uniqueList);
        System.out.println("LinkedHashSet = " + uniqueList1);
        System.out.println("TreeSet = " + uniqueList2);

        // sort by length and remove duplicates, if length same compare alphabetically
        List<String> sortByLenRemoveDuplicates = words.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(String::compareTo))
                .collect(Collectors.toList());

        System.out.println("sortByLenRemoveDuplicates = " + sortByLenRemoveDuplicates);

    }
}
