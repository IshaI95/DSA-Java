package Streams.Basics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Operations3 {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1, 21, 4, 50, 10, 11, 18, 20, 3, 13, 5, 0, 90);

        //Peak stream
        List<Integer> peekLst = lst.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("peeklst = " + peekLst);

        // Limit stream
        List<Integer> limitlst = lst.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("limitlst = " + limitlst);

        // skip elements in a list
        List<Integer> skplst = lst.stream().skip(3).collect(Collectors.toList());
        System.out.println("skplst = " + skplst);

        //convert to set
        List<Integer> lst1 = Arrays.asList(1, 20, 4, 50, 10, 1, 18, 20, 3, 13, 50, 0, 90);
        Set<Integer> lstset = lst1.stream().collect(Collectors.toSet());
        System.out.println("lstset = " + lstset);

        // get statistics
        IntSummaryStatistics stats = lst1.stream()
                .mapToInt(v -> v)
                .summaryStatistics();
        System.out.println("stats = " + stats);

    }
}
