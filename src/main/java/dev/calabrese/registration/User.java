package dev.calabrese.registration;

public class User {

  private  String name;
  private  String email;
  private  String password;

  User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }



  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
  }
}
