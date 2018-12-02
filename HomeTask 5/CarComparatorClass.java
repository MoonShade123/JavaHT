package com.hometask.hometask5;

import java.util.Comparator;

public class CarComparatorClass implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getSpeed() > o2.getSpeed()) {
            return 1;
        } else {
            if (o1.getSpeed() == o2.getSpeed()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
