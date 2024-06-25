package interfaces.sintaxa;

public interface MyInterface {

    double PI = 3.14;

    void doSomething();

    default void sayHello() {
        System.out.println("Hello!");
    }

    static void anotherHello() {
        System.out.println("Another Hello!");
    }

    private void test() {
        System.out.println("private test");
    }

    private static void anotherTest() {
        System.out.println("private static test");
    }
}
