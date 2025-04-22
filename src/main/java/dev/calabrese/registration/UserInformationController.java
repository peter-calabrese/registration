package dev.calabrese.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInformationController {

  private final UserService userService;

  public UserInformationController(UserService userService) {
    this.userService = userService;
  }
  @PostMapping(value="/add-user")
  @ResponseBody
  public void userInformation(@RequestBody User user) {
    userService.registerUser(user);

  }

}
