package ru.skypro;
// Наследование класса Transport
public class Bicycle extends Transport {
    // Создание конструктора класса
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount); // Наследование полей абстрактного класса
    }
}
