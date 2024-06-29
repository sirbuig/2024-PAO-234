package functionalProgramming;

@FunctionalInterface
interface MyFunctionalInterface<T> {

    boolean method(T t);
}


@FunctionalInterface
interface MySecondFunctionalInterface<T> {
    T method();
}

@FunctionalInterface
interface MyThirdFunctionalInterface<T, U> {
    boolean method(T t, U u);
}

public class Ex1_lambda {

    // (list of parameters -> {body of the function})
    public static void main(String[] args) {

        MySecondFunctionalInterface<Boolean> i1 = () -> false;
        boolean result = i1.method();
        System.out.println(result);

        MyFunctionalInterface<String> i2 = a -> a.startsWith("test");
        result = i2.method("test1234");
        System.out.println(result);

        MyFunctionalInterface<String> i3 = (String a) -> a.startsWith("test");
        result = i3.method("test1234");
        System.out.println(result);

        MyFunctionalInterface<String> i4 = a -> {
            System.out.println("Hello");
            return a.startsWith("test");
        };
        result = i4.method("test1234");
        System.out.println(result);

        MyThirdFunctionalInterface<String, String> i5 = (a, b) -> a.endsWith(b);
        result = i5.method("test1234", "34");
        System.out.println(result);

        MyThirdFunctionalInterface<String, String> i6 = (String a, String b) -> a.endsWith(b);
        result = i6.method("test1234", "34");
        System.out.println(result);
    }
}