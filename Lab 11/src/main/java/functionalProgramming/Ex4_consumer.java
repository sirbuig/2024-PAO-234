package functionalProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class Ex4_consumer {

    public static void main(String[] args) {

        Consumer<String> printer = x -> System.out.println(x);
        printer.accept("Hello");

        List<String> names = Arrays.asList("Anna", "Jane", "Mary");
        names.forEach(printer);
        names.forEach(System.out::println);
        System.out.println("Hello team");
        sayHelloToTeam(names);

        IntConsumer c1 = System.out::println;
        c1.accept(12);

        LongConsumer c2 = System.out::println;
        c2.accept(12L);

        DoubleConsumer c3 = System.out::println;
        c3.accept(12.3);

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> bc1 = (k, v) -> map.put(k, v);
        BiConsumer<String, Integer> bc2 = map::put;
        bc1.accept("bread", 5);
        bc2.accept("butter", 10);

        System.out.println(map);

        convertToText("My demo text", 1);
        convertToText("My demo text", 2);
        convertToText("My demo text", 3);
    }

    private static void sayHelloToTeam(List<String> names) {
        Consumer<String> sayHello = x -> System.out.println("Hello "+ x);
        Consumer<String> sayWelcome = x -> System.out.println("Welcome "+ x);

        Consumer<String> andThenConsumer = sayHello.andThen(sayWelcome);
        names.forEach(andThenConsumer);
    }

    private static void convertToText(String text, int operationCode) {
        BiConsumer<String, Integer> biConsumer = (String t, Integer op) -> {
            switch (op) {
                case 1:
                    System.out.println(t.toLowerCase());
                    break;
                case 2:
                    System.out.println(t.toUpperCase());
                    break;
                default:
                    System.out.println("Operation not found");
            }
        };

        biConsumer.accept(text, operationCode);
    }
}
