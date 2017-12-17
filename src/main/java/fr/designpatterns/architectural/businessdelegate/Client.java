package fr.designpatterns.architectural.businessdelegate;

public class Client {
  BusinessDelegate businessDelegate;

  public Client(BusinessDelegate businessDelegate) {
    this.businessDelegate = businessDelegate;
  }

  public String doTask() {
    return businessDelegate.doTask();
  }
}
