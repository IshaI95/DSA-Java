package Streams.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(11, 10, 20, 25, 67, 17, 90, 18, 14, 60, 120);

        List<Integer> answer = lst.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("answer list = " + answer);

    }
}
