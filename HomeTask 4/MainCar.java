package com.hometask;

import java.util.LinkedList;
import java.util.List;

public class MainCar {
    public static void main(String[] args) {



        List<Car> cars = new LinkedList<>();
        cars.add(new Car("Mercedes", 300, 1999, 190000, "Bad", "Light"));
        cars.add(new Car("BMV", 600, 2006, 500000, "Good", "Medium"));
        cars.add(new Car("Hundai", 1000, 2017, 1000000, "Newest", "Wagon"));

        cars.forEach(System.out::println);
    }
}
