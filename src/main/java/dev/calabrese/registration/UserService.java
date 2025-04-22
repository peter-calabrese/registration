package dev.calabrese.registration;

import org.springframework.stereotype.Component;

@Component
public class UserService {

  private UserRepository userRepository;
  private NotificationService notificationService;

  public UserService(UserRepository userRepository, NotificationService notificationService) {
    this.userRepository = userRepository;
    this.notificationService = notificationService;
  }

  public void registerUser(User user) {
    userRepository.save(user);
    notificationService.send("New User: " + user.getName() + " Created", user.getEmail());
  }

}

