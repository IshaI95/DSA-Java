package Streams.Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Operations1 {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1, 21, 4, 50, 10, 11, 18, 20, 3, 13, 5, 0, 90);

        // sort elements in a list in ascending order
        List<Integer> answerList = lst.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println("Sorted list = " + answerList);

        // sort in reverse order
//        List<Integer> reverseList = lst.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
        List<Integer> reverseList = lst.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Reverse Sorted list = " + reverseList);

        // Count the number of elements in a list that are greater than 5
        long count = lst.stream()
                .filter(n -> n>5)
                .count();
        System.out.println("number of elements greater than 5 = " + count);

        // Get Distinct or unique elements
        List<Integer> lst1 = Arrays.asList(1, 20, 4, 50, 10, 1, 18, 20, 3, 13, 50, 0, 90);

        List<Integer> lst2 = lst1.stream()
                .distinct().toList();

        System.out.println("Distinct elements = " + lst2);

        // Reduce elements of the list to their sum
        int sum = lst1.stream()
                .reduce(0, (a, b) -> a+b);

        int sum1 = lst1.stream()
                .reduce(0, Integer::sum);

        System.out.println("sum of elements = " + sum);
        System.out.println("sum of elements = " + sum1);

    }
}
