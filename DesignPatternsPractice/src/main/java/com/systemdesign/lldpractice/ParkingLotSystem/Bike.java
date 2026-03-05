package com.systemdesign.lldpractice.ParkingLotSystem;

public class Bike extends Vehicle {

    public Bike(String licensePlate) {
        super(licensePlate, VehicleSize.SMALL);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "licensePlate='" + super.licensePlate + '\'' +
                ", vehicleSize=" + super.vehicleSize +
                '}';
    }
    
}
