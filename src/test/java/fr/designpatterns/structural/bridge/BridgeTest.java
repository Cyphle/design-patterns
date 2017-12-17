package fr.designpatterns.structural.bridge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeTest {
  @Test
  public void should_bridge() throws Exception {
    Shape redCircle = new Circle(100, 100, 10, new RedCircle());
    Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

    assertThat(redCircle.draw()).isEqualTo("Drawing Circle[ color: red, radius: 10, x: 100, 100]");
    assertThat(greenCircle.draw()).isEqualTo("Drawing Circle[ color: green, radius: 10, x: 100, 100]");
  }
}
