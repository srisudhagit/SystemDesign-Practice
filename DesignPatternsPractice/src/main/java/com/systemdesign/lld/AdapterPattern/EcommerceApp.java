package com.systemdesign.lld.AdapterPattern;

public class EcommerceApp {
    public static void main(String[] args) {
        PaymentInterface paymentProcessor = new InHousePaymentProcessor();
        CheckoutService checkoutService = new CheckoutService(paymentProcessor);
        checkoutService.checkout(10, "USD");

    }
    
}
