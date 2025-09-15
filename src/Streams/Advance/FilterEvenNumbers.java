package Streams.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        int[] lst = {2, 13, 6, 7,9,8,10,34,50,81,25,48};

        //Explanation
        //Arrays.stream(nums) creates an IntStream, a stream of primitive int values.
        //This converts the primitive int values into boxed Integer objects.
        // This step is necessary because the Collectors.partitioningBy() collector requires
        // a stream of objects, not primitives.
        // Collectors.partitioningBy(...) takes a predicate and splits the stream into
        // two groups:
        //One for which the predicate is true
        //One for which the predicate is false
        Map<Boolean, List<Integer>> rslist = Arrays.stream(lst).boxed()
                        .collect(Collectors.partitioningBy(n -> n%2 == 0));

        Arrays.stream(lst)
                        .filter(n->n%2==0)
                .forEach(System.out::println);

        int[] even = Arrays.stream(lst)
                .filter(n->n%2==0)
                .toArray();

        System.out.println(rslist);
//        System.out.println(even);
        Arrays.stream(even).forEach(System.out::println);

        // pass alist to partitioning by
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        //Boxed() is required to covert only primitive values
        Integer[] arr = {1,2,3,4,5,6};
        Map<Boolean, List<Integer>> trial = Arrays.stream(arr)
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(trial);

        // Q> can we use two terminal operations together in streams
        // A> No — you cannot use two terminal operations together directly on a single Java Stream.
        // Once a terminal operation is called, the stream is consumed and cannot be reused.
        //Q> What happens if you try?
        // A> java.lang.IllegalStateException: stream has already been operated upon or closed

    }
}
