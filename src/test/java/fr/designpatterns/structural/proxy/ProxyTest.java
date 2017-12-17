package fr.designpatterns.structural.proxy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {
  @Test
  public void should_proxy() throws Exception {
    Image image = new ProxyImage("test_10mb.jpg");

    assertThat(image.display()).isEqualTo("Displaying test_10mb.jpg");
    assertThat(image.display()).isEqualTo("Displaying test_10mb.jpg from cache");
  }
}
