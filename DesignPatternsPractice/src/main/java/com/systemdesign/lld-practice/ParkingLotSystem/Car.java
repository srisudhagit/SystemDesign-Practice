package com.systemdesign.lld.ParkingLotSystem;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate, VehicleType.Car);
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + super.licensePlate + '\'' +
                ", vehicleType=" + super.vehicleType +
                '}';
    }
    
}
