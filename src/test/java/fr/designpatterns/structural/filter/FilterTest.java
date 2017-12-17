package fr.designpatterns.structural.filter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilterTest {
  @Test
  public void should_filter() throws Exception {
    List<Person> persons = new ArrayList<>();

    persons.add(new Person("Robert", "Male", "Single"));
    persons.add(new Person("John", "Male", "Married"));
    persons.add(new Person("Laura", "Female", "Married"));
    persons.add(new Person("Diana", "Female", "Single"));
    persons.add(new Person("Mike", "Male", "Single"));
    persons.add(new Person("Bobby", "Male", "Single"));

    Criteria male = new CriteriaMale();
    Criteria female = new CriteriaFemale();
    Criteria single = new CriteriaSingle();
    Criteria singleMale = new AndCriteria(single, male);
    Criteria singleOrFemale = new OrCriteria(single, female);

    assertThat(male.meetCriteria(persons)).containsExactly(
            new Person("Robert", "Male", "Single"),
            new Person("John", "Male", "Married"),
            new Person("Mike", "Male", "Single"),
            new Person("Bobby", "Male", "Single")
    );

    assertThat(female.meetCriteria(persons)).containsExactly(
            new Person("Laura", "Female", "Married"),
            new Person("Diana", "Female", "Single")
    );

    assertThat(singleMale.meetCriteria(persons)).containsExactly(
            new Person("Robert", "Male", "Single"),
            new Person("Mike", "Male", "Single"),
            new Person("Bobby", "Male", "Single")
    );

    assertThat(singleOrFemale.meetCriteria(persons)).containsExactlyInAnyOrder(
            new Person("Robert", "Male", "Single"),
            new Person("Laura", "Female", "Married"),
            new Person("Diana", "Female", "Single"),
            new Person("Mike", "Male", "Single"),
            new Person("Bobby", "Male", "Single")
    );
  }
}
