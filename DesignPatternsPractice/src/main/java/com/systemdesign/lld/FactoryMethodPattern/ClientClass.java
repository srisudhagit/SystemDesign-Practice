package com.systemdesign.lld.FactoryMethodPattern;

public class ClientClass {
    public static void main(String[] args) {
        NotificationFactory factory;

        // create Email notification
        factory = new EmailNotificationFactory();
        factory.notifyUser("Hello via Email!"); 

        // create SMS notification
        factory = new SMSNotificationFactory();
        factory.notifyUser("Hello via SMS!");
    }
}