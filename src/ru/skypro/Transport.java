package ru.skypro;
// Создание абстрактного класса и инкапсуляция полей класса
public abstract class Transport {
    private final String modelName;
    private int wheelsCount;
// Создание гетеров
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
// Создание конструктора класса
    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
}