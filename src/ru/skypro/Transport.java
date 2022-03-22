package ru.skypro;
// Создание абстрактного класса и инкапсуляция полей класса
public abstract class Transport {
    private final String modelName;
    private int wheelsCount;
    private boolean engine = false;
    private boolean trailer = false;

      public boolean isEngine() {
        return engine;
    }

    public boolean isTrailer() {
        return trailer;
    }

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