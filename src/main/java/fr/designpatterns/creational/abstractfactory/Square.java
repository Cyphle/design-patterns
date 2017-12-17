package fr.designpatterns.creational.abstractfactory;

public class Square implements Shape {
  @Override
  public String draw() {
    return "Inside Square::draw() method.";
  }
}
