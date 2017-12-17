package fr.designpatterns.architectural.businessdelegate;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BusinessDelegateTest {
  @Test
  public void should_delegate() throws Exception {
    BusinessDelegate businessDelegate = new BusinessDelegate();
    businessDelegate.setServiceType("EJB");

    Client client = new Client(businessDelegate);
    assertThat(client.doTask()).isEqualTo("Processing task by invoking EJB Service");

    businessDelegate.setServiceType("JMS");
    assertThat(client.doTask()).isEqualTo("Processing task by invoking JMS Service");
  }
}
