package com.hometask;

import java.util.Objects;

public class HT4 {
    public HT4(String name, int capacility, int startYear, int parts, String condition) {

    }

    public HT4(int parts, String condition) {

    }

    public HT4(String name, int capacility, int startYear, int parts, String condition, String kind) {

    }

    public abstract class Transort {

        private String name;

        private int capacility;

        private int startYear;

        public Transort(String name, int capacility, int startYear) {
            this.name = name;
            capacility = capacility;
            startYear = startYear;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCapacity() {
            return capacility;
        }

        public void setCapacity(int capacility) {
            capacility = capacility;
        }

        public int getStartYear() {
            return startYear;
        }

        public void setStartYear(int startYear) {
            startYear = startYear;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if ((o == null) || getClass() != o.getClass()) return false;
            Transort trans = (Transort) o;
            return name == trans.name &&
                  capacility == trans.capacility &&
                  startYear == trans.startYear;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, capacility, startYear);
        }
    }

}
