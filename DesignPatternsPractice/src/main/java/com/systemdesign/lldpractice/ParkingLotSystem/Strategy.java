package com.systemdesign.lldpractice.ParkingLotSystem;

public interface Strategy {
    
    public long calculateParkingFee(Vehicle vehicle, long hoursParked);
    
}
