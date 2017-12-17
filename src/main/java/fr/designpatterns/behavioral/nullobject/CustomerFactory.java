package fr.designpatterns.behavioral.nullobject;

public class CustomerFactory {
  public static final String[] names = {"Rob", "Joe", "Julie"};

  public static AbstractCustomer getCustomer(String name) {
    for (String name1 : names) {
      if (name1.equalsIgnoreCase(name)) {
        return new RealCustomer(name);
      }
    }
    return new NullCustomer();
  }
}