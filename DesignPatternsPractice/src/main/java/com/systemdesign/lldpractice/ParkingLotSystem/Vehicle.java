package com.systemdesign.lldpractice.ParkingLotSystem;

public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleSize vehicleSize;

    public Vehicle(String licensePlate, VehicleSize vehicleSize) {
        if(licensePlate == null || licensePlate.isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be null or empty");
        }
        this.licensePlate = licensePlate;
        this.vehicleSize = vehicleSize;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vehicleSize=" + vehicleSize +
                '}';
    }
}
