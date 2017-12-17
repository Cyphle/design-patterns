package fr.designpatterns.behavioral.interpreter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterpreterTest {
  @Test
  public void should_interpret() throws Exception {
    Expression isMale = getMaleExpression();
    Expression isMarriedWoman = getMarriedWomanExpression();

    assertThat(isMale.interpret("John")).isTrue();
    assertThat(isMarriedWoman.interpret("Married Julie")).isTrue();
  }

  //Rule: Robert and John are male
  public static Expression getMaleExpression() {
    Expression robert = new TerminalExpression("Robert");
    Expression john = new TerminalExpression("John");
    return new OrExpression(robert, john);
  }

  //Rule: Julie is a married women
  public static Expression getMarriedWomanExpression() {
    Expression julie = new TerminalExpression("Julie");
    Expression married = new TerminalExpression("Married");
    return new AndExpression(julie, married);
  }
}
