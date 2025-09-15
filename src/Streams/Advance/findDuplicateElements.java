package Streams.Advance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicateElements {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(11, 18, 25, 25, 67, 67, 90, 18, 14, 90, 120);

        Set<Integer> set = new HashSet<Integer>();

        Set<Integer> ansset = lst.stream()
                .filter(n -> !set.add(n))
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements = " + ansset);
    }

}
