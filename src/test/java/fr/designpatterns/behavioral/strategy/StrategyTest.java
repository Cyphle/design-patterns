package fr.designpatterns.behavioral.strategy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyTest {
  @Test
  public void should_strategy() throws Exception {
    Context context = new Context(new OperationAdd());
    assertThat(context.executeStrategy(10, 5)).isEqualTo(15);

    context = new Context(new OperationSubstract());
    assertThat(context.executeStrategy(10, 5)).isEqualTo(5);

    context = new Context(new OperationMultiply());
    assertThat(context.executeStrategy(10, 5)).isEqualTo(50);
  }
}
