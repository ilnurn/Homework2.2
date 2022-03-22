package ru.skypro;

// Наследование класса Transport
public class Truck extends Transport {

    // Создание конструктора класса
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount); // Наследование полей абстрактного класса
    }
    @Override
    public boolean isEngine() {
        return true;
    }

    @Override
    public boolean isTrailer() {
        return true;
    }
}

