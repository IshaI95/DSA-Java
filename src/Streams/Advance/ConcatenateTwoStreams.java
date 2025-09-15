package Streams.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Java", "is", "easy");
        List<String> list2 = Arrays.asList("to", "understand", "nowadays");

        Stream<String> strm = Stream.concat(list1.stream(),list2.stream());

        strm.forEach(str -> System.out.print(str + " "));
    }
}
