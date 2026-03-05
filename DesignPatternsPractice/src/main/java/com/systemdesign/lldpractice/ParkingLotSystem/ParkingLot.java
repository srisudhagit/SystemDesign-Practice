package com.systemdesign.lldpractice.ParkingLotSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ParkingLot
{
    private List<ParkingFloor> totalFloors;
    private int totalSpotsPerLevel;
    private static volatile ParkingLot instance;
    private Map<String, ParkingTicket> activeTickets;
    private Strategy fareStrategy;
    
    private ParkingLot() {
        totalFloors = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }

    public void initialize(int totalLevels, List<ParkingFloor> parkingFloors, Strategy fareStrategy) {
        this.totalFloors = parkingFloors;
        this.fareStrategy = fareStrategy;
        this.activeTickets = new HashMap<>();
    }

    public void addFloor(ParkingFloor floor) {
        totalFloors.add(floor);
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) throws ParkingLotException {
        ParkingSpot assignedSpot = null;
        for(ParkingFloor floor : totalFloors) {
            assignedSpot = floor.getAvailableSpot(vehicle);
            if(assignedSpot != null) {  
                break;
            }
        }   
        if(assignedSpot == null) {
                throw new ParkingLotException("No available spot for vehicle " + vehicle.getLicensePlate());
            }
        String ticketId = UUID.randomUUID().toString().substring(0,8);
        ParkingTicket ticket = new ParkingTicket(ticketId, vehicle, assignedSpot);
        assignedSpot.parkVehicle(vehicle);
        this.activeTickets.put(ticketId, ticket);
        System.out.println("Vehicle parked at spot " + assignedSpot.getId() + " with ticket " + ticket.getTicketId());
        return ticket;
    }

    public boolean unparkVehicle(String ticketId) {
       if(ticketId == null || !activeTickets.containsKey(ticketId)) {
           throw new ParkingLotException("Invalid ticket ID");
       }
        ParkingTicket ticket = activeTickets.get(ticketId);
        ParkingSpot spot = ticket.getParkingSpot();
        spot.unparkVehicle();
        ticket.setExitTime(LocalDateTime.now());
        activeTickets.remove(ticketId);
        long hoursParked = ticket.calculateParkingDurationInHours();
        System.out.println("Vehicle with ticket " + ticketId + " unparked. Total fare: $" + fareStrategy.calculateParkingFee(ticket.getVehicle(), hoursParked));
        return true;
    }

    public void displayAvailability() {
        System.out.println("Parking Lot Availability:");
        for(ParkingFloor floor : totalFloors) {
            System.out.println("Floor " + floor.getLevelNumber() + ": " );
            
            for(VehicleSize size : VehicleSize.values()) {
                int cnt = 0;
                for(ParkingSpot spot : floor.getParkingSpots()) {
                    if(spot.getSpotSize() == size && !spot.isAvailable()) {
                        cnt++;
                    }
                }
                System.out.println(size.name() + ": " + cnt + " spots available");  
            }
        }
    }
}
