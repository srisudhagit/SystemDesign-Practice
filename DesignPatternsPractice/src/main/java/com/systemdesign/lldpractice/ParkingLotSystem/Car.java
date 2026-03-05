package com.systemdesign.lldpractice.ParkingLotSystem;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate, VehicleSize.MEDIUM);
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + super.licensePlate + '\'' +
                ", vehicleSize=" + super.vehicleSize +
                '}';
    }
    
}
