package com.systemdesign.lld;

import com.systemdesign.lld.ParkingLotSystem.Level;
import com.systemdesign.lld.ParkingLotSystem.ParkingLot;

public class ParkingLotTest {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addLevel(new Level(1, 20));

       // parkingLot.parkVehicle(new Vehicle("ABC123", "Car"));
    
       // parkingLot.parkVehicle(new Vehicle("XYZ789", "Truck"));

       // parkingLot.parkVehicle(new Vehicle("LMN456", "MotorCycle"));
        
    }
}
