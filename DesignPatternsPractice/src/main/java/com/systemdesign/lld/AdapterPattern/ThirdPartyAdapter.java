package com.systemdesign.lld.AdapterPattern;

public class ThirdPartyAdapter implements PaymentInterface{
    private long transactionId;
    private ThirdPartyPaymentProcessor thirdpartyinstance;

    public ThirdPartyAdapter(){
        this.thirdpartyinstance = new ThirdPartyPaymentProcessor();
    }

    public void processPayment(double amount, String currency){
        System.out.println("Adapter: Translating payment of " + amount + " " + currency);
        thirdpartyinstance.executeTransaction(amount,currency);
        this.transactionId = thirdpartyinstance.getReferenceNumber();
     }

    public boolean isPaymentSuccessful(){
        return thirdpartyinstance.checkStatus(transactionId);
    }

    public String getTransactionId(){
        return "LEGACY_TXN_" + transactionId;
    }
}
