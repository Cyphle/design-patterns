package fr.designpatterns.creational.prototype;

public class Square extends Shape {
  public Square() {
    type = "Square";
  }

  @Override
  public String draw() {
    return "Inside Square::draw() method.";
  }
}
