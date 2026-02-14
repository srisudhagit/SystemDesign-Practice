package com.systemdesign.lld.ParkingLotSystem;

public class MotorCycle extends Vehicle {

    public MotorCycle(String licensePlate) {
        super(licensePlate, VehicleType.MotorCycle);
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "licensePlate='" + super.licensePlate + '\'' +
                ", vehicleType=" + super.vehicleType +
                '}';
    }
    
}
