package com.pluralsight;

public class Vehicle {

    /**
     * hold information about specific vehicle
     */
    private int vin;
    private int year;
    private String make;
    private String model;
    private int odometer;
    private double price;
    private String vehicleType;

    private String color;


    public Vehicle(int vin, int year, String make, String model, int odometer, double price, String vehicleType, String color) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.price = price;
        this.vehicleType = vehicleType;
        this.color = color;
    }
}
