package com.javabasics.collections.arraylist;

public class Car {
    String carName;
    int carPrice;

    public Car(String carName, int carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
