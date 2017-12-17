package fr.designpatterns.behavioral.memento;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MementoTest {
  @Test
  public void should_store_state() throws Exception {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();
    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #3");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #4");

    assertThat(originator.getState()).isEqualTo("State #4");
    originator.getStateFromMemento(careTaker.get(0));
    assertThat(originator.getState()).isEqualTo("State #2");
    originator.getStateFromMemento(careTaker.get(1));
    assertThat(originator.getState()).isEqualTo("State #3");
  }
}
