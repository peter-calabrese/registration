package dev.calabrese.registration;

public interface NotificationService {
  public void send(String message, String recipientEmail);
}
