package interfaces.generice;

public class Main {

    public static void main(String[] args) {
        Producer<Car> carProducer = new CarProducer();

        Car car = carProducer.produce();
    }
}
