package com.systemdesign.lldpractice.ParkingLotSystem;

public class FlatFareStrategy implements Strategy {

    private long flatFare;

    public FlatFareStrategy(long flatFare) {
        this.flatFare = flatFare;
    }

    @Override
    public long calculateParkingFee(Vehicle vehicle, long hoursParked) {
        return flatFare;
    }
    
}
