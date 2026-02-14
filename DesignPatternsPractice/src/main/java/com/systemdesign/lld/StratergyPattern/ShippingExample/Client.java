package com.systemdesign.lld.StratergyPattern.ShippingExample;

public class Client {
    public static void main(String[] args) {
        ShippingStrategy flaFare = new FlatFareShipping(5);
        Order order = new Order();

        ShippingCostService shipServ = new ShippingCostService(flaFare);
        shipServ.calShippingOrder(order);

        flaFare = new WeightBasedShipping(10.5);
        shipServ.setStrategy(flaFare);
        shipServ.calShippingOrder(order);
    
    }
}
