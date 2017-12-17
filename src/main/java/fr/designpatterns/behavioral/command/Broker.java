package fr.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
  private List<Order> orderList = new ArrayList<>();

  public void takeOrder(Order order) {
    orderList.add(order);
  }

  public List<String> placeOrders() {
    List<String> executedOrders = new ArrayList<>();
    for (Order order : orderList) {
      executedOrders.add(order.execute());
    }
    orderList.clear();
    return executedOrders;
  }
}
