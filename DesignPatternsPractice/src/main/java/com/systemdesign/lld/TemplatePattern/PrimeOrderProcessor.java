package com.systemdesign.lld.TemplatePattern;

public class PrimeOrderProcessor extends OrderProcessor {

    @Override
    protected void validateOrder() {
        System.out.println("Validating prime order details with priority.");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment for prime order with expedited handling.");
    }

    @Override
    protected void arrangeShipping() {
        System.out.println("Arranging express shipping for prime order.");
    }
    
}
