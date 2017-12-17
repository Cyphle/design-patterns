package fr.designpatterns.behavioral.mediator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MediatorTest {
  @Test
  public void should_mediate() throws Exception {
    User robert = new User("Robert");
    User john = new User("John");

    assertThat(robert.sendMessage("Hi! John!")).isEqualTo("Thu Dec 14 19:05:34 CET 2017 [Robert] : Hi! John!");
    assertThat(john.sendMessage("Hello! Robert!")).isEqualTo("Thu Dec 14 19:05:34 CET 2017 [John] : Hello! Robert!");
  }
}
