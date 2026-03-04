package com.systemdesign.lld.TemplatePattern;

public abstract class OrderProcessor {
    
    public final void processOrder() {
        validateOrder();
        processPayment();
        arrangeShipping();
        sendConfirmation();
        System.err.println("Order processing completed.");
    }

    protected abstract void validateOrder();

    protected abstract void processPayment();

    protected abstract void arrangeShipping();

    protected void sendConfirmation(){
            System.out.println("Sending order confirmation email to the customer.");
    }

}
