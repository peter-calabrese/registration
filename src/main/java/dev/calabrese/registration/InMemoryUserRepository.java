package dev.calabrese.registration;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryUserRepository implements UserRepository {
  List<User> users = new ArrayList<User>();

  @Override
  public void save(User user) {
    users.add(user);
  }
}
