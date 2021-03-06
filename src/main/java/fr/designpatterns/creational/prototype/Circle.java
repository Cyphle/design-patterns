package fr.designpatterns.creational.prototype;

public class Circle extends Shape {
  public Circle() {
    type = "Circle";
  }

  @Override
  public String draw() {
    return "Inside Circle::draw() method.";
  }
}
