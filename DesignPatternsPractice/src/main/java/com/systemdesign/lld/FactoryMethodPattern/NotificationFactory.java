package com.systemdesign.lld.FactoryMethodPattern;

public abstract class NotificationFactory {
    // factory method to create notification objects dynamically
    public abstract Notification createNotification();

    // common method to notify user
    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
