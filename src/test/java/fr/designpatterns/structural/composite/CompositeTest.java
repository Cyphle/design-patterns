package fr.designpatterns.structural.composite;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {
  @Test
  public void should_compose() throws Exception {
    Employee CEO = new Employee("John", "CEO", 30000);
    Employee headSales = new Employee("Robert", "Head Sales", 20000);
    Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
    Employee clerk1 = new Employee("Laura", "Marketing", 10000);
    Employee clerk2 = new Employee("Bob", "Marketing", 10000);
    Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
    Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

    CEO.add(headSales);
    CEO.add(headMarketing);

    headSales.add(salesExecutive1);
    headSales.add(salesExecutive2);

    headMarketing.add(clerk1);
    headMarketing.add(clerk2);

    assertThat(CEO.getSubordinates()).containsExactly(
            new Employee("Robert", "Head Sales", 20000),
            new Employee("Michel", "Head Marketing", 20000)
    );

    assertThat(headSales.getSubordinates()).containsExactly(
            new Employee("Richard", "Sales", 10000),
            new Employee("Rob", "Sales", 10000)
    );

    assertThat(headMarketing.getSubordinates()).containsExactly(
            new Employee("Laura", "Marketing", 10000),
            new Employee("Bob", "Marketing", 10000)
    );
  }
}
