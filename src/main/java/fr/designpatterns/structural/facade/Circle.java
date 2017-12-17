package fr.designpatterns.structural.facade;

public class Circle implements Shape {
  @Override
  public String draw() {
    return "Circle::draw()";
  }
}
