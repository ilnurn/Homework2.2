package ru.skypro;
// Наследование класса Transport
public class Car extends Transport {

    // Создание конструктора класса
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount); // Наследование полей абстрактного класса
    }

    @Override
    public boolean isEngine() {
        return true;
    }
}
