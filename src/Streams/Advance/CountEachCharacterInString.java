package Streams.Advance;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

    public static void main(String[] args) {
        String example = "What is functional programming in java?";

        Map<String, Long> map = Arrays.stream(example.split(""))
                .map(s -> s.toLowerCase())
                .filter(str -> !str.equals(" ")) // ignore spaces
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }




}
