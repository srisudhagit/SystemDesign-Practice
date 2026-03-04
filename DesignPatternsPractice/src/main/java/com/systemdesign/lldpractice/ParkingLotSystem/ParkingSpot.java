package com.systemdesign.lld.ParkingLotSystem;

public class ParkingSpot {
    private int id;
    private Vehicle parkedVehicle;
    private final VehicleType vehicleType;

    public ParkingSpot(int id,VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }   

    public synchronized boolean isAvailable() {
        return parkedVehicle == null;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        if (isAvailable() && vehicle.getVehicleType() == vehicleType) {
            this.parkedVehicle = vehicle;
        } else {
            throw new IllegalStateException("Parking spot is not available or vehicle type does not match.");               
        }
    }

    public synchronized void unparkVehicle() {
        if (parkedVehicle != null) {
            parkedVehicle = null;
        } else {
            throw new IllegalStateException("Parking spot is already empty.");
        }       
    }
}
