package fr.designpatterns.behavioral.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IteratorTest {
  @Test
  public void should_iterate() throws Exception {
    NameRepository namesRepository = new NameRepository();

    List<String> names = new ArrayList<>();
    for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
      String name = (String) iter.next();
      names.add(name);
    }

    assertThat(names).containsExactly(
            "Robert",
            "John",
            "Julie",
            "Lora"
    );
  }
}
