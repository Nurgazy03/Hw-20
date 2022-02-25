package com.company;
public class Car implements AutoCloseable {

    private String model;
    private double volume;

    @Override
    public void close() throws RuntimeException {
        System.out.println(getModel()+"'s door has already closed");
    }

    void drive() {
        System.out.println(getModel()+" is driving");
    }

    public Car(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return
                "model: " + model + '\n' +
                "volume: " + volume;
    }
}
