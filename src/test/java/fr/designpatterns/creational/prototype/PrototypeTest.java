package fr.designpatterns.creational.prototype;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeTest {
  @Test
  public void should_load_from_cache() throws Exception {
    ShapeCache.loadCache();

    Shape clonedShape = (Shape) ShapeCache.getShape("1");
    assertThat("Shape : " + clonedShape.getType()).isEqualTo("Shape : Circle");

    Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
    assertThat("Shape : " + clonedShape2.getType()).isEqualTo("Shape : Square");

    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
    assertThat("Shape : " + clonedShape3.getType()).isEqualTo("Shape : Rectangle");
  }
}
