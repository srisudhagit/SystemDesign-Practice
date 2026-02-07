package com.systemdesign.lld.FactoryMethodPattern;

public class EmailNotificationFactory extends NotificationFactory {
    // object creation logic is pushed to subclasses of the factory
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
    
}
