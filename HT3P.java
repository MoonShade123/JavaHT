package com.hometask;

public class HT3P {
    public class Bus {

        private String Name;

        private int BusNumber;

        private int RoutNumber;

        private String Model;

        private int StartYear;

        private int Mileage;



        public String getName() {

            return Name;

        }



        public void setName(String name) {

            this.Name = name;

        }



        public int getBusNumber() {

            return BusNumber;

        }



        public void setBusNumber(int busNumber) {

            this.BusNumber = busNumber;

        }



        public int getRoutNumber() {

            return RoutNumber;

        }



        public void setRoutNumber(int routNumber) {

            this.RoutNumber = routNumber;

        }



        public String getModel() {

            return Model;

        }



        public void setModel(String model) {

            this.Model = model;

        }



        public int getStartYear() {

            return StartYear;

        }



        public void setStartYear(int startYear) {

            this.StartYear = startYear;

        }



        public int getMileage() {

            return Mileage;

        }



        public void setMileage(int mileage) {

            this.Mileage = mileage;

        }







        public Bus(String name, int busNumber, int routNumber, String model, int startYear, int mileage) {

            this.Name = name;

            this.BusNumber = busNumber;

            this.RoutNumber = routNumber;

            this.Model = model;

            this.StartYear = startYear;

            this.Mileage = mileage;

        }

    }
}
