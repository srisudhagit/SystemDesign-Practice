package com.systemdesign.lldpractice.ParkingLotSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    private int levelNumber;
    private List<ParkingSpot> parkingSpots;
    private Map<VehicleSize, Integer> typeCountMap;

        public ParkingFloor(int levelNumber) {
            this.levelNumber = levelNumber;
            this.parkingSpots = new ArrayList<>();
            this.typeCountMap = new HashMap<>();
        }
        
        private void initializeParkingSpots(Map<VehicleSize, Integer> parkingSpots) {
            for (Map.Entry<VehicleSize, Integer> entry : parkingSpots.entrySet()) {
                VehicleSize size = entry.getKey();
                int count = entry.getValue();
                for (int i = 0; i < count; i++) {
                    String spotId = String.format("F%d-%s%03d", levelNumber, size.name(), i);
                    this.parkingSpots.add(new ParkingSpot(spotId, size));
                }
            }
        }

        public ParkingSpot addParkingSpot(VehicleSize size) {
            String spotId = String.format("F%d-%s%03d", levelNumber, size.name(), parkingSpots.size());
            ParkingSpot spot = new ParkingSpot(spotId, size);
            parkingSpots.add(spot);
            typeCountMap.put(size, typeCountMap.getOrDefault(size, 0) + 1);
            return spot;
        }

        public int getLevelNumber() {
            return levelNumber;
        }

        public ParkingSpot getAvailableSpot(Vehicle vehicle) {
            for (ParkingSpot spot : parkingSpots) {
                if (spot.canFitVehicle(vehicle)) {
                    return spot;
                }
            }
            return null;
        }

        public int getAvailableSpotsBySize(VehicleSize size) {
            return this.typeCountMap.getOrDefault(size, 0);
        }

        public List<ParkingSpot> getParkingSpots() {
            return parkingSpots;
        }
}
