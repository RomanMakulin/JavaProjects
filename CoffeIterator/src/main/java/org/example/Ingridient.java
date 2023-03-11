package org.example;

public abstract class Ingridient {
    protected String brand;
    protected double volume;


    public Ingridient(String brand, double volume) {
        this.brand = brand;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return String.format("Название бренда: %s, объем: %f мл", brand, volume);
    }
}
