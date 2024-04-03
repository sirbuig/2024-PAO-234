package interfaces.factoryMethod;

import static interfaces.factoryMethod.TransportationType.SHIP;
import static interfaces.factoryMethod.TransportationType.TRUCK;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Ship ship = new Ship();

        truck.deliver();
        ship.deliver();

        Transport truck2 = new Truck();
        truck2.deliver();

        Transport ship2 = new Ship();
        ship2.deliver();

        Transport truck3 = TransportFactory.getTransportation(TRUCK);
        Transport ship3 = TransportFactory.getTransportation(SHIP);

        truck3.deliver();
        ship3.deliver();
    }
}
