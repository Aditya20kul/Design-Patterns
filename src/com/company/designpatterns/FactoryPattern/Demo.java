package com.company.designpatterns.FactoryPattern;


public class Demo {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification1 = notificationFactory.createNotification("SMS");
        notification1.notifyUser();
        Notification notification2 = notificationFactory.createNotification("EMAIL");
        notification2.notifyUser();
        Notification notification3 = notificationFactory.createNotification("SLACK");
        notification3.notifyUser();
    }
}
