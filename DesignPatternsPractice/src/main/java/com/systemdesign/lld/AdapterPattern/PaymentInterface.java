package com.systemdesign.lld.AdapterPattern;

public interface PaymentInterface {
    void processPayment(double amount, String currency);
    boolean isPaymentSuccessful();
    String getTransactionId();
}
