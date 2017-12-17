package fr.designpatterns.architectural.servicelocator;

public class Service2 implements Service {
  @Override
  public String getName() {
    return "Service2";
  }

  @Override
  public String execute() {
    return "Executing Service2";
  }
}
