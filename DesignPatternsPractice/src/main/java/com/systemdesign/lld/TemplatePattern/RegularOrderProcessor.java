package com.systemdesign.lld.TemplatePattern;

public class RegularOrderProcessor extends OrderProcessor {

    @Override
    protected void validateOrder() {
        System.out.println("Validating regular order details.");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment for regular order.");
    }

    @Override
    protected void arrangeShipping() {
        System.out.println("Arranging standard shipping for regular order.");
    }
    
}
