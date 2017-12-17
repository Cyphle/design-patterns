package fr.designpatterns.structural.flyweight;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FlyweightTest {
  private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

  @Test
  public void should_flyweight() throws Exception {
    List<String> drawings = new ArrayList<>();

    for (int i = 0; i < 20; ++i) {
      Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.setRadius(100);
      drawings.add(circle.draw());
    }

    assertThat(drawings).isNotEmpty();
  }

  private static String getRandomColor() {
    return colors[(int) (Math.random() * colors.length)];
  }

  private static int getRandomX() {
    return (int) (Math.random() * 100);
  }

  private static int getRandomY() {
    return (int) (Math.random() * 100);
  }
}
