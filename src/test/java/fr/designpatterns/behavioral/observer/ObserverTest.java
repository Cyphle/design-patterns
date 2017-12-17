package fr.designpatterns.behavioral.observer;

import org.junit.Test;

public class ObserverTest {
  @Test
  public void should_observe() throws Exception {
    Subject subject = new Subject();
    Observer hexa = new HexaObserver(subject);
    Observer octal = new OctalObserver(subject);
    Observer binary = new BinaryObserver(subject);

    System.out.println("First state change: 15");
    subject.setState(15);
    System.out.println("Second state change: 10");
    subject.setState(10);
  }
}
