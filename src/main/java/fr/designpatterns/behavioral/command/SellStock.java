package fr.designpatterns.behavioral.command;

public class SellStock implements Order {
  private Stock abcStock;

  public SellStock(Stock abcStock) {
    this.abcStock = abcStock;
  }


  @Override
  public String execute() {
    return abcStock.sell();
  }
}
