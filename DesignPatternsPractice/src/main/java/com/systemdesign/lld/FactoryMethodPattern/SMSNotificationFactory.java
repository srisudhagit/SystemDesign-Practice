package com.systemdesign.lld.FactoryMethodPattern;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }   
}
