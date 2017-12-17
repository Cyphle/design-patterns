package fr.designpatterns.architectural.servicelocator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ServiceLocatorTest {
  @Test
  public void should_locate() throws Exception {
    Service service = ServiceLocator.getService("Service1");
    assertThat(service.execute()).isEqualTo("Executing Service1");

    service = ServiceLocator.getService("Service2");
    assertThat(service.execute()).isEqualTo("Executing Service2");

    service = ServiceLocator.getService("Service1");
    assertThat(service.execute()).isEqualTo("Executing Service1");

    service = ServiceLocator.getService("Service2");
    assertThat(service.execute()).isEqualTo("Executing Service2");
  }
}
