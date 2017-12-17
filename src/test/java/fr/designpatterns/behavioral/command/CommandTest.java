package fr.designpatterns.behavioral.command;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandTest {
  @Test
  public void should_command() throws Exception {
    Stock abcStock = new Stock();
    BuyStock buyStockOrder = new BuyStock(abcStock);
    SellStock sellStockOrder = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);

    assertThat(broker.placeOrders()).containsExactly(
            "Stock [ Name: ABC, Quantity: 10 ] bought",
            "Stock [ Name: ABC, Quantity: 10 ] sold"
    );
  }
}
