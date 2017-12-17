package fr.designpatterns.architectural.frontcontroller;

import java.util.ArrayList;
import java.util.List;

public class FrontController {
  private Dispatcher dispatcher;

  public FrontController() {
    dispatcher = new Dispatcher();
  }

  private boolean isAuthenticUser() {
    System.out.println("User is authenticated successfully.");
    return true;
  }

  private String trackRequest(String request) {
    return "Page requested: " + request;
  }

  public List<String> dispatchRequest(String request) {
    List<String> output = new ArrayList<>();
    //log each request
    output.add(trackRequest(request));
    //authenticate the user
    if (isAuthenticUser()) {
      output.add(dispatcher.dispatch(request));
    }

    return output;
  }
}
