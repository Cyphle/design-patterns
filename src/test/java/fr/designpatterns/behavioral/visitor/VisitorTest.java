package fr.designpatterns.behavioral.visitor;

import org.junit.Test;

public class VisitorTest {
  @Test
  public void should_visit() throws Exception {
    ComputerPart computer = new Computer();
    computer.accept(new ComputerPartDisplayVisitor());
  }
}
