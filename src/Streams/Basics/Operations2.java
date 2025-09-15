package Streams.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Operations2 {

    public static void main(String[] args) {

        // Return any element from a list of integers
        List<Integer> lst = Arrays.asList(1, 21, 4, 50, 10, 11, 18, 20, 3, 13, 5, 0, 90);

        Optional<Integer> result = lst.parallelStream()
                .findAny();
        System.out.println("find any result " + result);

        Optional<Integer> result1 = lst.parallelStream()
                .findFirst();
        System.out.println("find first result " + result1);

        // Extract first names from a list of full names
        List<String> names = Arrays.asList("John Singh", "Mona roy", "Peter Disouza");

        List<String> firstNames = names.stream()
                .map(s -> s.split(" ")[0])
                .collect(Collectors.toList());

        System.out.println("First names = " + firstNames);

        // Check if all numbers in a list are positive.
        boolean allPositive = lst.stream().allMatch(n-> n>=0);

        System.out.println("Are all numbers positive = " + allPositive);

        // Check if there are no negative numbers in a list.
        boolean noNegative = lst.stream().noneMatch( n -> n<0);
        System.out.println("Are no numbers negative = " + noNegative);

        //Flat map for nested lists
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(3,4,5));

        List<Integer> newList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("New flattened list = " + newList);

    }
}
