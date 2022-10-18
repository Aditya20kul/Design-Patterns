package com.company.designpatterns.FactoryPattern;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Notification through SMS");
    }
}
