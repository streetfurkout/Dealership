package com.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    // Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory);
    }

    // Stub methods for search functionality
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null; // To be implemented later
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null; // To be implemented later
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null; // To be implemented later
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null; // To be implemented later
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null; // To be implemented later
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null; // To be implemented later
    }

    public void removeVehicle(Vehicle vehicle) {
        // To be implemented later
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }
}
