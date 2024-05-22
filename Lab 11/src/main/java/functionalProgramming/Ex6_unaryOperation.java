package functionalProgramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Ex6_unaryOperation {

    public static void main(String[] args) {
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("This is my demo text"));

        IntUnaryOperator intUnaryOperator = x -> x * 2;
        System.out.println(intUnaryOperator.applyAsInt(20));

        LongUnaryOperator longUnaryOperator = x -> x * 2;
        DoubleUnaryOperator doubleUnaryOperator = x -> x * 2;
        System.out.println(longUnaryOperator.applyAsLong(14L));
        System.out.println(doubleUnaryOperator.applyAsDouble(19.46));
    }
}
