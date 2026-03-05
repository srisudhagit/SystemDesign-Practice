package com.systemdesign.lldpractice.ParkingLotSystem;

public class MotorCycle extends Vehicle {

    public MotorCycle(String licensePlate) {
        super(licensePlate, VehicleSize.SMALL);
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "licensePlate='" + super.licensePlate + '\'' +
                ", vehicleSize=" + super.vehicleSize +
                '}';
    }
    
}
