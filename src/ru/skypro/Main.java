package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Service service = new ServiceStation();
        Car[] cars = new Car[]{
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] trucks = new Truck[]{
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycles = new Bicycle[]{
                new Bicycle("bicicle1", 2),
                new Bicycle("bicicle2", 2)
        };

        for (int i = 0; i < cars.length; i++) {
            service.check(cars[i]);
        }
        for (int i = 0; i < trucks.length; i++) {
            service.check(trucks[i]);
        }
        for (int i = 0; i < bicycles.length; i++) {
            service.check(bicycles[i]);
        }
    }
}
