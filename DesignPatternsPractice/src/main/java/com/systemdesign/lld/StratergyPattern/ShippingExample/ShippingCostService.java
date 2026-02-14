package com.systemdesign.lld.StratergyPattern.ShippingExample;

public class ShippingCostService {
    ShippingStrategy strategy;

    public ShippingCostService(ShippingStrategy str){
        this.strategy = str;
    }

    public void setStrategy(ShippingStrategy str){
        System.out.println("Strategy has been modified from "+this.strategy.getStartegy()+" to "+str.getStartegy());
        this.strategy = str;
    }

    public double calShippingOrder(Order order){
        if(strategy == null){
            throw new IllegalStateException("Shipping not set");
        }
        double cost = strategy.calculateCost(order);
        System.out.println("Shipping cost calculated using "+strategy.getStartegy()+" costs to "+cost);
        return cost;
    }
}
