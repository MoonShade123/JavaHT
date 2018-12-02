package com.hometask.hometask5;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Comparator<Car> carCompClass = new CarComparatorClass();
        List<Car> cars = new LinkedList<>();


        cars.add(new Car("Mercedes", 170));
        cars.add(new Car("BMV", 170));
        cars.add(new Car("Audi", 150));
        cars.add(new Car("Volkswagen", 90));
        cars.add(new Car("Opel", 70));
        cars.sort(carCompClass);
        cars.forEach(System.out::println);
    }
}
