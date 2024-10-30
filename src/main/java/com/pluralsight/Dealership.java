package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    /**
     * Will hold information about the dealership (name,address, ...) and maintain list of vehicles.
     * Since it has a list of vehicles, it will also have methods that search the list for matching
     * vehicles as well as add/remove vehicles
     */
    private String name;
    private String address;
    private String phone;

    private static final ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }


    public List<Vehicle> getVehiclesByYear(double min, double max){return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public  List<Vehicle> getVehiclesByMileage () {
        return  null;
    }

    public List<Vehicle> getVehiclesByType (String type) {
     return null;
    }

    public List<Vehicle> getAllVehicle () {
        return null;
    }

    public void addVehicle() {

    }
    public void removeVehicle() {

    }
}

