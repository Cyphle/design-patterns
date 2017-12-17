package fr.designpatterns.creational.factory;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShapeFactoryTest {
  private ShapeFactory shapeFactory;

  @Before
  public void setUp() throws Exception {
    shapeFactory = new ShapeFactory();
  }

  @Test
  public void should_create_shapes() throws Exception {
    Shape shapeOne = shapeFactory.getShape("CIRCLE");
    assertThat(shapeOne.draw()).isEqualTo("Inside Circle::draw() method.");
  }
}
