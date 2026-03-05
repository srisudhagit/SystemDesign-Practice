package com.systemdesign.lldpractice.ParkingLotSystem;

public class HourlyFareStrategy implements Strategy {

    private long hourlyRate;

    public HourlyFareStrategy(long hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public long calculateParkingFee(Vehicle vehicle, long hoursParked) {
        return hourlyRate * hoursParked;
    }
    
}
