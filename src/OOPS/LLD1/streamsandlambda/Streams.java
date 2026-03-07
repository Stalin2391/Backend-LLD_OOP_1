package OOPS.LLD1.streamsandlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 5, 4, 1, 6, 0, 7, 10, 2, 8));
        // Stream is an interface.

        // Task: print even numbers.

        Stream<Integer> stream = list.stream();

        List<Integer> evenNumbers = stream
                .filter((x) -> x % 2 == 0)
                .sorted()
                .map((x) -> x * x)
                .toList();
//        System.out.println(evenNumbers);

        List<String> words = new ArrayList<>(List.of("java", "lamba", "streams", "data structure", "programming" ));

        Stream<String> stream1 = words.stream();
        long result = stream1
                .filter((word) -> word.length() > 6)
                .count();
        System.out.println(result);

        List<Double> prices = new ArrayList<>(List.of(100.0, 200.5, 1000.0, 500.67));

        // Using stream, add 10% tax to each price.

        List<Double> output = prices.stream()
                .map((price) -> price + (price * 10 / 100))
                .toList();

        System.out.println(output);


        List<Integer> numners = new ArrayList<>(List.of(5, 20, 10, 50, 80, 7, 13));

        int sum = numners.stream()
                .filter((num) -> num > 10)
//                .reduce(0, (x, y) -> x + y); or
                .mapToInt((x) -> x)
                .sum();

        System.out.println(sum);

        // Using streams, calculate the sum of all the numbers greater than 10.

    }
}
