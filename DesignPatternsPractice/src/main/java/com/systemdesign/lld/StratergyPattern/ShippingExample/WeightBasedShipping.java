package com.systemdesign.lld.StratergyPattern.ShippingExample;

public class WeightBasedShipping implements ShippingStrategy{
    private double pricePerKg;

    public WeightBasedShipping(double price){
        this.pricePerKg = price;
    }

    // this is the main algorithm this strategy implements which differentiates from other startegies
     public double calculateCost(Order order){
        System.out.println("Calculating price as per the weight of order");
        return order.getWeight() * pricePerKg;
     }

    @Override
    public String getStartegy() {
        return "Weight based";
    }
}
