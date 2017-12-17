package fr.designpatterns.architectural.interceptingfilter;

public class Target {
  public String execute(String request) {
    return "Executing request: " + request;
  }
}
