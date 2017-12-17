package fr.designpatterns.behavioral.chainofresponsibility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChainOfResponsibilityTest {
  @Test
  public void should_chain_of_responsibility() throws Exception {
    AbstractLogger loggerChain = getChainOfLoggers();

    assertThat(loggerChain.logMessage(AbstractLogger.INFO, "This is an information.")).isEqualTo("Standard Console::Logger: This is an information.");
    assertThat(loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.")).isEqualTo("File::Logger: This is a debug level information.");
    assertThat(loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.")).isEqualTo("Error Console::Logger: This is an error information.");
  }

  private static AbstractLogger getChainOfLoggers() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);
    return errorLogger;
  }
}
