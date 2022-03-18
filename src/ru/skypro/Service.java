package ru.skypro;
// Создание интерфейса и перегрузка метода check
public interface Service {
    void check(Car car);

    void check(Truck truck);

    void check(Bicycle bicycle);

}
