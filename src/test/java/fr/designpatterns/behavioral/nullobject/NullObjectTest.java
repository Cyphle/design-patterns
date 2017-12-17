package fr.designpatterns.behavioral.nullobject;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NullObjectTest {
  @Test
  public void should_null_object_when_not_exists() throws Exception {
    AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
    AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
    AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
    AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

    assertThat(customer1.getName()).isEqualTo("Rob");
    assertThat(customer2.getName()).isEqualTo("Not Available in Customer Database");
    assertThat(customer3.getName()).isEqualTo("Julie");
    assertThat(customer4.getName()).isEqualTo("Not Available in Customer Database");
  }
}
