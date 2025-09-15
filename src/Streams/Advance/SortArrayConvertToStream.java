package Streams.Advance;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortArrayConvertToStream {

    public static void main(String[] args) {

        int[] arr = {55, 32, 45, 108, 78, 90, 23, 5, 78, 87};

        Arrays.sort(arr);

        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    }
}
