package com.hometask.hometask5;

public class Car implements InterfaceTwo, InterfaceThree {
    private String Name;
    private int Speed;

    @Override
    public String toString() {
        return "Car{" +
                "Name of ur car='" + Name + '\'' +
                ", Speed of ur car=" + Speed +
                '}';
    }

    public Car() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public Car(String name, int speed) {
        Name = name;
        Speed = speed;
    }

    @Override
    public void secondInterfaceMethod() {

    }

    @Override
    public void thirdInterfaceMethodOne() {

    }

    @Override
    public void thirdInterfaceMethodTwo() {

    }
}
