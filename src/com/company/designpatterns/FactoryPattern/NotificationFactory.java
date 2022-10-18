package com.company.designpatterns.FactoryPattern;

public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()) return null;
        switch(channel){
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "SLACK":
                return new SlackNotification();
            default:
                throw new IllegalArgumentException("Unknown Channel: "+ channel);
        }
    }
}
