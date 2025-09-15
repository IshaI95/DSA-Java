package Streams.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeListElementsAndFilter {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10, 11, 12, 13);

        List<Integer> cubeList = nums.stream()
                .map(x -> x*x*x)
                .filter(x -> x>50)
                .collect(Collectors.toList());
        System.out.println("cubes of numbers which are greater than 50 = " + cubeList);
    }
}
