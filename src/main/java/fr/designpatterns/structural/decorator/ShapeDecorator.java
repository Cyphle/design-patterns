package fr.designpatterns.structural.decorator;

public abstract class ShapeDecorator implements Shape {
  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }

  public String draw() {
    return decoratedShape.draw();
  }
}