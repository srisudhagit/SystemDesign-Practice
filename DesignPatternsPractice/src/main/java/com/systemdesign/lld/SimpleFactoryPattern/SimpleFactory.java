package com.systemdesign.lld.SimpleFactoryPattern;

public class SimpleFactory {
    // creating objects is moved to factory class
    // 
    public void sendNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) {
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.send();
        } else if (type.equalsIgnoreCase("SMS")) {
            SMSNotification smsNotification = new SMSNotification();
            smsNotification.send();
        } else if (type.equalsIgnoreCase("PUSH")) {
            PushNotification pushNotification = new PushNotification();
            pushNotification.send();
        } else {
            System.out.println("Invalid notification type");
        }
    }
}

// multiple notification classes
class EmailNotification {
    public void send() {
        System.out.println("Sending an Email notification");
    }
}

class SMSNotification {
    public void send() {
        System.out.println("Sending an SMS notification");
    }
}

class PushNotification {
    public void send() {
        System.out.println("Sending a Push notification");
    }
}