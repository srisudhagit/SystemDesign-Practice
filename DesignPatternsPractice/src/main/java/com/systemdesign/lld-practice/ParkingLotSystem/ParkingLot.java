package com.systemdesign.lld.ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot
{
    private int totalLevels;
    private int totalSpotsPerLevel;
    private List<Level> levels;
    private static ParkingLot instance;
    
    private ParkingLot() {
        levels = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked at level " + level.getLevelNumber());
                return true;
            }
        }
        System.out.println("No available spots for vehicle " + vehicle.getLicensePlate());
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.unparkVehicle(vehicle)) {
                System.out.println("Vehicle unparked from level " + level.getLevelNumber());
                return true;
            }
        }
        System.out.println("Vehicle " + vehicle.getLicensePlate() + " not found.");
        return false;
    }

    public void displayAvailability() {
        for (Level level : levels) {
            level.displayAvailability();
        }
    }

    public int getTotalLevels() {
        return totalLevels;
    }

   
}
