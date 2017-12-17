package fr.designpatterns.structural.decorator;

public class Rectangle implements Shape {
  @Override
  public String draw() {
    return "Shape: Rectangle";
  }
}
