package com.systemdesign.lld.SimpleFactoryPattern;

// Creation of Service is decoupled from its usage
// client doesn't focus on creating instance. It just passes the details and factory takes care of creating instances according to required type.
public class NotificationService {
    private SimpleFactory simpleFactory;

    public NotificationService() {
        this.simpleFactory = new SimpleFactory();
    }

    public void notifyUser(String type) {
        // Delegate the notification sending to the SimpleFactory
        // This still has tight coupling with SimpleFactory we can improve it using Factory Method Pattern
        simpleFactory.sendNotification(type);
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser("EMAIL");
        notificationService.notifyUser("SMS");
        notificationService.notifyUser("PUSH");
        notificationService.notifyUser("INVALID");
    }
}
