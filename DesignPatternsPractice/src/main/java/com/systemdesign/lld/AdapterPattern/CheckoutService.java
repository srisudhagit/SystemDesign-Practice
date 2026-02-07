package com.systemdesign.lld.AdapterPattern;

public class CheckoutService {
    PaymentInterface paymentProcessor;

    public CheckoutService(PaymentInterface inf){
        this.paymentProcessor = inf;
    }

    public void checkout(double amount, String currency){
        System.out.println("CheckoutService: Attempting to process order for $" + amount + " " + currency);
        paymentProcessor.processPayment(amount, currency);
        if(paymentProcessor.isPaymentSuccessful()){
              System.out.println("CheckoutService: Order successful! Transaction ID: " 
                               + paymentProcessor.getTransactionId());
        }else{
              System.out.println("CheckoutService: Order failed. Payment was not successful.");
        }
    }
}
