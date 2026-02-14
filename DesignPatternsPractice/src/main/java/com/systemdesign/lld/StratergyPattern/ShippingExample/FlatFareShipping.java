package com.systemdesign.lld.StratergyPattern.ShippingExample;

public class FlatFareShipping implements ShippingStrategy{
    private double price;

    public FlatFareShipping(double price){
        this.price = price;
    }

    // this is the main algorithm this strategy implements which differentiates from other startegies
     public double calculateCost(Order order){
        System.out.println("Calculating using Flat fare pricing");
        return price;
     }

    @Override
    public String getStartegy(){
        return "Flatfare";
    }
    
}
