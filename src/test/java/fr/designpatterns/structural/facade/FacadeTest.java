package fr.designpatterns.structural.facade;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FacadeTest {
  @Test
  public void should_facade() throws Exception {
    ShapeMaker shapeMaker = new ShapeMaker();

    assertThat(shapeMaker.drawCircle()).isEqualTo("Circle::draw()");
    assertThat(shapeMaker.drawRectangle()).isEqualTo("Rectangle::draw()");
    assertThat(shapeMaker.drawSquare()).isEqualTo("Square::draw()");
  }
}
