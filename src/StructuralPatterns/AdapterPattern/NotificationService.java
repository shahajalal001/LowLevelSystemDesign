package StructuralPatterns.AdapterPattern;

public interface  NotificationService {
    void send(String to, String subject, String body);
}
