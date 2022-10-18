package com.company.designpatterns.FactoryPattern;

public class SlackNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notification through Slack");
    }
}
