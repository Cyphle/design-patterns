package fr.designpatterns.architectural.businessdelegate;

public class EJBService implements BusinessService {
  @Override
  public String doProcessing() {
    return "Processing task by invoking EJB Service";
  }
}
