package fr.designpatterns.behavioral.state;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StateTest {
  @Test
  public void should_state() throws Exception {
    Context context = new Context();

    StartState startState = new StartState();
    assertThat(startState.doAction(context)).isEqualTo("Player is in start state");
    assertThat(context.getState().toString()).isEqualTo("Start State");

    StopState stopState = new StopState();
    assertThat(stopState.doAction(context)).isEqualTo("Player is in stop state");
    assertThat(context.getState().toString()).isEqualTo("Stop State");
  }
}
