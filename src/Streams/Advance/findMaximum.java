package Streams.Advance;

import java.util.Arrays;
import java.util.List;

public class findMaximum {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(11, 18, 25, 25, 67, 67, 90, 18, 14, 90, 120);

        int maxm = lst.stream().max(Integer::compare).get();
        System.out.println("Maximum element = " + maxm);
    }
}
