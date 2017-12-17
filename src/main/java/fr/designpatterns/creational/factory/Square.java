package fr.designpatterns.creational.factory;

public class Square implements Shape {
  @Override
  public String draw() {
    return "Inside Square::draw() method.";
  }
}
