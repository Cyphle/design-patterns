package fr.designpatterns.creational.factory;

public class Rectangle implements Shape {
  @Override
  public String draw() {
    return "Inside Rectangle::draw() method.";
  }
}
