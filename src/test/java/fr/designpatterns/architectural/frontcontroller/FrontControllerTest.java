package fr.designpatterns.architectural.frontcontroller;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrontControllerTest {
  @Test
  public void should_control() throws Exception {
    FrontController frontController = new FrontController();

    assertThat(frontController.dispatchRequest("HOME")).containsExactly(
            "Page requested: HOME",
            "Displaying Home Page"
    );
    assertThat(frontController.dispatchRequest("STUDENT")).containsExactly(
            "Page requested: STUDENT",
            "Displaying Student Page"
    );
  }
}
