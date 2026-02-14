package com.systemdesign.lld.StratergyPattern.ShippingExample;

public interface ShippingStrategy {
    
    public double calculateCost(Order order);
    public String getStartegy();
}
