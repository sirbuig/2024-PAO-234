package singleton;

public class Main {

    public static void main(String[] args) {
        MySingleton singleton1 = MySingleton.getInstance();
        MySingleton singleton2 = MySingleton.getInstance();

        if (singleton2 == singleton1){
            System.out.println("MySingleton is a singleton");
        }
    }
}
