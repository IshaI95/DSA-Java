package Streams.Advance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnyValueAppearsAtleastTwice {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(11, 18, 25, 25, 67, 67, 90, 18, 14, 90, 120);
        int[] nums = {11, 18, 25, 25, 67, 67, 90, 18, 14, 90, 120};

        Set<Integer> set= new HashSet<>();
//
//        boolean value = lst.stream()
//                .AnyMatch(s -> !set.add(s));

        boolean value1 = Arrays.stream(nums).anyMatch(num -> !set.add(num));
        System.out.println("Any match found for value appearing at least twice=  " + value1);
    }
}
