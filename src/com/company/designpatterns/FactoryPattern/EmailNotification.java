package com.company.designpatterns.FactoryPattern;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notification through Email");
    }
}
