package Streams.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Lion",20));
        animals.add(new Animal("Goat", 10));
        animals.add(new Animal("fish", 10));
        animals.add(new Animal("Giraffe", 40));
        animals.add(new Animal("Fox", 40));
        animals.add(new Animal("Tiger", 20));
        animals.add(new Animal("rabbit", 5));
        animals.add(new Animal("cat", 5));

        // group animals by age
        animals.stream()
                .collect(Collectors.groupingBy(Animal::getAge))
                .forEach((key,value) -> System.out.println("key: " + key + " value= " + value));


    }
}
