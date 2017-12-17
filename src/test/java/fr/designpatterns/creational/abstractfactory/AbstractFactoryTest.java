package fr.designpatterns.creational.abstractfactory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {
  @Test
  public void should_test_abstract_factory() throws Exception {
    //get shape factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
    //get an object of Shape Circle
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    //call draw method of Shape Circle
    assertThat(shape1.draw()).isEqualTo("Inside Circle::draw() method.");

    //get an object of Shape Rectangle
    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    //call draw method of Shape Rectangle
    assertThat(shape2.draw()).isEqualTo("Inside Rectangle::draw() method.");

    //get an object of Shape Square
    Shape shape3 = shapeFactory.getShape("SQUARE");
    //call draw method of Shape Square
    assertThat(shape3.draw()).isEqualTo("Inside Square::draw() method.");

    //get color factory
    AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
    //get an object of Color Red
    Color color1 = colorFactory.getColor("RED");
    //call fill method of Red
    assertThat(color1.fill()).isEqualTo("Inside Red::fill() method.");

    //get an object of Color Green
    Color color2 = colorFactory.getColor("Green");
    //call fill method of Green
    assertThat(color2.fill()).isEqualTo("Inside Green::fill() method.");

    //get an object of Color Blue
    Color color3 = colorFactory.getColor("BLUE");
    //call fill method of Color Blue
    assertThat(color3.fill()).isEqualTo("Inside Blue::fill() method.");
  }
}
