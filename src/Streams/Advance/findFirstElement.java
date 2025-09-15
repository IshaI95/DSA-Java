package Streams.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirstElement {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(11, 18, 25, 25, 67, 67, 90, 18, 14, 90, 120);

        //lst.stream().findFirst().ifPresent(System.out::println);

        Optional<Integer> result = lst.stream().findFirst();
        System.out.println(result);
    }
}
