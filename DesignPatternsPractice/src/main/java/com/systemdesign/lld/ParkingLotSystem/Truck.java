package com.systemdesign.lld.ParkingLotSystem;

public class Truck extends Vehicle {

    public Truck(String licensePlate) {
        super(licensePlate, VehicleType.Truck);
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + super.licensePlate + '\'' +
                ", vehicleType=" + super.vehicleType +
                '}';
    }
}
