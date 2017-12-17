package fr.designpatterns.creational.factory;

public class Circle implements Shape {
  @Override
  public String draw() {
    return "Inside Circle::draw() method.";
  }
}
