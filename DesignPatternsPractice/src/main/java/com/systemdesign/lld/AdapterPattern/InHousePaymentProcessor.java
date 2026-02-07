package com.systemdesign.lld.AdapterPattern;

public class InHousePaymentProcessor implements PaymentInterface{
    private String transactionId;
    private boolean isPaymentSuccessful;

    public void processPayment(double amount, String currency){
        System.out.println("InHousePaymentProcessor: Processing payment of " + amount + " " + currency);
        transactionId = "TXN_" + System.currentTimeMillis();
        this.isPaymentSuccessful = true;
        System.out.println("InHousePaymentProcessor: Payment successful. Txn ID: " + transactionId);
     }

    public boolean isPaymentSuccessful(){
        return this.isPaymentSuccessful;
    }

    public String getTransactionId(){
        return this.transactionId;
    }
}
