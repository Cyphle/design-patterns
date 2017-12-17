package fr.designpatterns.architectural.businessdelegate;

public class JMSService implements BusinessService {
  @Override
  public String doProcessing() {
    return "Processing task by invoking JMS Service";
  }
}
