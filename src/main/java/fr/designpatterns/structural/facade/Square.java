package fr.designpatterns.structural.facade;

public class Square implements Shape {
  @Override
  public String draw() {
    return "Square::draw()";
  }
}
