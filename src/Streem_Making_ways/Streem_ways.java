package Streem_Making_ways;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streem_ways {
//Java 8 introduced the powerful Stream API to work with collections in a functional style. But do you know how many ways you can actually create a stream?

//Let’s explore the most common and useful ways to create streams in Java 
	public static void main(String[] args)
	{
		// 1. From Collection
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("1. From Collection:");
        list.stream().forEach(System.out::println);

        // 2. From Array
        String[] array = {"Dog", "Cat", "Elephant"};
        System.out.println("\n2. From Array:");
        Arrays.stream(array).forEach(System.out::println);

        // 3. Using Stream.of()
        System.out.println("\n3. Using Stream.of():");
        Stream.of("Red", "Green", "Blue").forEach(System.out::println);

        // 4. Using Stream.builder()
        System.out.println("\n4. Using Stream.builder():");
        Stream.<String>builder().add("One").add("Two").add("Three").build().forEach(System.out::println);

        // 5. Using Stream.generate()
        System.out.println("\n5. Using Stream.generate():");
        Stream.generate(() -> "Hello").limit(3).forEach(System.out::println);

        // 6. Using Stream.iterate()
        System.out.println("\n6. Using Stream.iterate():");
        Stream.iterate(1, n -> n + 1).limit(5).forEach(System.out::println);

        // 7. Primitive Streams
        System.out.println("\n7. IntStream.range:");
        IntStream.range(1, 5).forEach(System.out::println);

        System.out.println("\n7. LongStream.rangeClosed:");
        LongStream.rangeClosed(1, 3).forEach(System.out::println);

        

        // 9. From String (split using regex)
        System.out.println("\n9. From String Split:");
        Pattern.compile(",").splitAsStream("A,B,C").forEach(System.out::println);

        // 10. From Optional
        System.out.println("\n10. From Optional:");
        Optional<String> optional = Optional.of("OptionalValue");
        optional.stream().forEach(System.out::println);

        // 11. From Map
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");
        System.out.println("\n11. From Map - Keys:");
        map.keySet().stream().forEach(System.out::println);

        System.out.println("\n11. From Map - Values:");
        map.values().stream().forEach(System.out::println);

        System.out.println("\n11. From Map - Entries:");
        map.entrySet().stream().forEach(entry -> 
            System.out.println(entry.getKey() + " = " + entry.getValue())
        );
    }

}
