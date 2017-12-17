package fr.designpatterns.architectural.servicelocator;

public class Service1 implements Service {
  @Override
  public String getName() {
    return "Service1";
  }

  @Override
  public String execute() {
    return "Executing Service1";
  }
}
