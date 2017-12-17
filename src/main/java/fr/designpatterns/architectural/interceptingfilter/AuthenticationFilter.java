package fr.designpatterns.architectural.interceptingfilter;

public class AuthenticationFilter implements Filter {
  @Override
  public String execute(String request) {
    return "Authenticating request: " + request;
  }
}
