package Streams.Basics;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {

    public static void main(String[] args) {
        // Filter Even numbers in a list
        List<Integer> lst = Arrays.asList(1, 2, 4, 5, 10, 11, 18, 20, 3, 13);

        List<Integer> evenNumbers = lst.stream()
                .filter( n -> n%2 == 0)
                .collect(Collectors.toList());

        System.out.println("List of even numbers " + evenNumbers);

        // maximum value in a list of integers
        OptionalInt max = lst.stream()
                        .mapToInt(v->v)
                        .max();
        System.out.println("Maximum of the list " + max);

        Optional<Integer> max1 = lst
                                .stream()
                                .max(Integer::compare);

        System.out.println("Maximum of the list " + max1);

        // Sum of all elements in a list
        int sum = lst.stream()
                .mapToInt(v->v)
                .sum();
        System.out.println("Sum of all the elements in a list " + sum);

        //conver all strings in a list to uppercase
        List<String> fruits = Arrays.asList("mango", "apple", "Banana", "Guvava");

        List<String> fruitsUpper = fruits
                                    .stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());
        System.out.println("Strings in a list in uppercase" + fruitsUpper);
    }
}
