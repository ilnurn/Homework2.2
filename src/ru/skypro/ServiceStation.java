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
    public void check(Transport transport) {

        updateTire(transport);
        if (transport.isEngine() == true) {
            checkEngine();
        }
        if (transport.isTrailer() == true) {
            checkTrailer();
        }
    }
}


