package com.systemdesign.lld.ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int levelNumber;
    private int availableSpots;
    private List<ParkingSpot> parkingSpots;
    private int totalSpots;

    public Level(int levelNumber, int numSpots) {
        this.levelNumber = levelNumber;
        parkingSpots = new ArrayList<>(numSpots);
        // Assign spots in ration of 50:40:10 for bikes, cars and trucks
        double spotsForBikes = 0.50;
        double spotsForCars = 0.40;

        int numBikes = (int) (numSpots * spotsForBikes);
        int numCars = (int) (numSpots * spotsForCars);

        for (int i = 1; i <= numBikes; i++) {
            parkingSpots.add(new ParkingSpot(i,VehicleType.MotorCycle));
        }
        for (int i = numBikes + 1; i <= numBikes + numCars; i++) {
            parkingSpots.add(new ParkingSpot(i,VehicleType.Car));
        }
        for (int i = numBikes + numCars + 1; i <= numSpots; i++) {
            parkingSpots.add(new ParkingSpot(i,VehicleType.Truck));
        }
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable() && spot.getVehicleType() == vehicle.getVehicleType()) {
                spot.parkVehicle(vehicle);
                availableSpots--;
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getParkedVehicle() != null && spot.getParkedVehicle().equals(vehicle)) {
                spot.unparkVehicle();
                availableSpots++;
                return true;
            }
        }
        return false;
    }

    public void displayAvailability(){
        System.out.println("Level " + levelNumber + " has " + availableSpots + " available spots out of " + totalSpots);
        for (ParkingSpot spot : parkingSpots) {
            System.out.println("Spot " + spot.getId() + ": is " + (spot.isAvailable() ? "available" : "occupied") + " by vehicle " + (spot.getParkedVehicle() != null ? spot.getParkedVehicle().getLicensePlate() : "none")); 
        }    
    }
}
