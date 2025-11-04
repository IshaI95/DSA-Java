package Streams.CustomObjects;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Operations {

    public static void main(String[] args) {

        List<Order> orderList = List.of(
                new Order(1, List.of("Car","Camera","Charger"), Status.CREATED),
                new Order(2, List.of("Bike","Handle"), Status.CREATED),
                new Order(3, List.of("Mobile","Cover"), Status.PENDING),
                new Order(4, List.of("Laptop", "keyboard", "Mouse"), Status.COMPLETED),
                new Order(5, List.of("Scooty", "Mirror"), Status.PENDING)
        );

        Map<Status, Long> map = orderList.stream()
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));

        List<String> allProducts = orderList.stream()
                        .flatMap(order -> order.getProductName().stream())
                        .collect(Collectors.toList());

        System.out.println(map);
        System.out.println(allProducts);

        // sort orders by no. of items, if number of items same, sort by id
        List<Order> sortedOrder = orderList.stream()
                .sorted(Comparator.comparing((Order o) -> o.getProductName().size())
                        .thenComparing(Order::getId))
                .collect(Collectors.toList());

        sortedOrder.forEach(System.out::println);

        System.out.println("sorted orders =  " + sortedOrder);
    }
}
