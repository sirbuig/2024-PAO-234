package functionalProgramming;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class Ex7_binaryOperation {

    public static void main(String[] args) {
        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println(sum.apply(15, 46));

        IntBinaryOperator sum2 = (a, b) -> a + b;
        System.out.println(sum2.applyAsInt(12, 23));

        DoubleBinaryOperator sum3 = (a, b) -> Math.pow(a, b);
        LongBinaryOperator sum4 = (a, b) -> a * b;
        System.out.println(sum3.applyAsDouble(2, 2.5));
        System.out.println(sum4.applyAsLong(4, 6));

        BinaryOperator<String> sum5 = String::concat;
        System.out.println(sum5.apply("Hello", "World"));
    }
}
