package fr.designpatterns.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  @Override
  public String draw() {
    return decoratedShape.draw() + ", " + setRedBorder(decoratedShape);
  }

  private String setRedBorder(Shape decoratedShape) {
    return "Border Color: Red";
  }
}
