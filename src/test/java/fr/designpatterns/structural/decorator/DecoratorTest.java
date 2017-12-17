package fr.designpatterns.structural.decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {
  @Test
  public void should_decorate() throws Exception {
    Shape circle = new Circle();

    Shape redCircle = new RedShapeDecorator(new Circle());
    Shape redRectangle = new RedShapeDecorator(new Rectangle());

    assertThat(circle.draw()).isEqualTo("Shape Circle");

    assertThat(redCircle.draw()).isEqualTo("Shape Circle, Border Color: Red");

    assertThat(redRectangle.draw()).isEqualTo("Shape: Rectangle, Border Color: Red");
  }
}
