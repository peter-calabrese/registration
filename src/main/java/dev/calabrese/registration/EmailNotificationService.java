package dev.calabrese.registration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{

  @Value("${email.port}")
  private String port;
  @Value("${email.host}")
  private String host;

  @Override
  public void send(String message, String recipientEmail){

    System.out.println("Email notification sent to "+recipientEmail);
    System.out.println("Email sent via: "+host + " Using port: "+port);
    System.out.println("Message: "+ message);

  }
}
