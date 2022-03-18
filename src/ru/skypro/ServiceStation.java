package ru.skypro;
// Реализация интерфейса Service
public class ServiceStation implements Service {

    private void updateTire(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
        }
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
// Реализация методов интерфейса и перегрузка метода check
    @Override
    public void check(Car car) {
        updateTire(car);
        checkEngine();
    }

    @Override
    public void check(Truck truck) {
        updateTire(truck);
        checkEngine();
        checkTrailer();
    }

    @Override
    public void check(Bicycle bicycle) {
        updateTire(bicycle);
    }
}
