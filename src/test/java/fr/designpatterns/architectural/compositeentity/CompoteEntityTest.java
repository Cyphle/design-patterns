package fr.designpatterns.architectural.compositeentity;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompoteEntityTest {
  @Test
  public void should_composite() throws Exception {
    Client client = new Client();
    client.setData("Test", "Data");
    assertThat(client.printData()).containsExactly(
            "Data: Test",
            "Data: Data"
    );
    client.setData("Second Test", "Data1");
    assertThat(client.printData()).containsExactly(
            "Data: Second Test",
            "Data: Data1"
    );
  }
}
