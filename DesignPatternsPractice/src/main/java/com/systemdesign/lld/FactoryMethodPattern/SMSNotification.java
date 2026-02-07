package com.systemdesign.lld.FactoryMethodPattern;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS Notification with message: " + message);
    }
}
