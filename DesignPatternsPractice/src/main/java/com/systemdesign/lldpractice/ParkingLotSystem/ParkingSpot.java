package com.systemdesign.lldpractice.ParkingLotSystem;

public class ParkingSpot {
    private String id;
    private Vehicle parkedVehicle;
    private final VehicleSize spotSize;

    public ParkingSpot(String id,VehicleSize vehicleSize) {
        this.id = id;
        this.spotSize = vehicleSize;
    }

    public String getId() {
        return id;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }   

    public synchronized boolean isAvailable() {
        return parkedVehicle == null;
    }   

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable() && spotSize == vehicle.getVehicleSize();
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        if (canFitVehicle(vehicle)) {
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
