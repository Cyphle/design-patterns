package fr.designpatterns.creational.abstractfactory;

public class Rectangle implements Shape {
  @Override
  public String draw() {
    return "Inside Rectangle::draw() method.";
  }
}
