package com.systemdesign.lldpractice.ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;


public class ParkingLotTest {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        List<ParkingFloor> totalFloors = new ArrayList<>();

        ParkingFloor parkingFloor1 = new ParkingFloor(1);
        parkingFloor1.addParkingSpot(VehicleSize.SMALL);
        parkingFloor1.addParkingSpot(VehicleSize.MEDIUM);
        parkingFloor1.addParkingSpot(VehicleSize.LARGE);
        parkingFloor1.addParkingSpot(VehicleSize.SMALL);
        parkingFloor1.addParkingSpot(VehicleSize.MEDIUM);


        ParkingFloor parkingFloor2 = new ParkingFloor(2);
        parkingFloor2.addParkingSpot(VehicleSize.SMALL);
        parkingFloor2.addParkingSpot(VehicleSize.MEDIUM);
        parkingFloor2.addParkingSpot(VehicleSize.LARGE);
        parkingFloor2.addParkingSpot(VehicleSize.SMALL);
        parkingFloor2.addParkingSpot(VehicleSize.LARGE);

        totalFloors.add(parkingFloor1);
        totalFloors.add(parkingFloor2);

        parkingLot.initialize(3, totalFloors, new FlatFareStrategy(50));
        
        Vehicle vehicle1 = new Bike("KA-01-AB-1234");
        Vehicle vehicle2 = new Car("KA-01-AB-5678");
        Vehicle vehicle3 = new Truck("KA-01-AB-9012");
       
        try {
            ParkingTicket ticket1 = parkingLot.parkVehicle(vehicle1);
            ParkingTicket ticket2 = parkingLot.parkVehicle(vehicle2);
            ParkingTicket ticket3 = parkingLot.parkVehicle(vehicle3);

            parkingLot.unparkVehicle(ticket2.getTicketId());
            parkingLot.unparkVehicle(ticket1.getTicketId());
            parkingLot.unparkVehicle(ticket3.getTicketId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
