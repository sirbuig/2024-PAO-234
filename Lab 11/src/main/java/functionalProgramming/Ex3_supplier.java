package functionalProgramming;

import java.time.LocalDate;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Ex3_supplier {

    public static void main(String[] args) {
        Supplier<Integer> numbers = () -> 11;
        System.out.println(returnNumber(numbers));

        IntSupplier numbers2 = () -> Integer.MAX_VALUE;
        System.out.println(numbers2.getAsInt());

        LongSupplier numbers3 = () -> Long.MAX_VALUE;
        System.out.println(numbers3.getAsLong());

        DoubleSupplier numbers4 = () -> Math.PI;
        System.out.println(numbers4.getAsDouble());

        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Supplier<LocalDate> s2 = LocalDate::now; //references a static method
        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<StringBuilder> s3 = () -> new StringBuilder();
        Supplier<StringBuilder> s4 = StringBuilder::new;
    }

    private static int returnNumber(Supplier<Integer> numbers) {
        return numbers.get();
    }
}
