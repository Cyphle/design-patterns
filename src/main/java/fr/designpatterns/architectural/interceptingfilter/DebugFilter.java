package fr.designpatterns.architectural.interceptingfilter;

public class DebugFilter implements Filter {
  @Override
  public String execute(String request) {
    return "request log: " + request;
  }
}
