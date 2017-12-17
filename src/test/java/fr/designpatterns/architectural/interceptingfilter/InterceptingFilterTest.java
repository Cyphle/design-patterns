package fr.designpatterns.architectural.interceptingfilter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterceptingFilterTest {
  @Test
  public void should_intercept() throws Exception {
    FilterManager filterManager = new FilterManager(new Target());
    filterManager.setFilter(new AuthenticationFilter());
    filterManager.setFilter(new DebugFilter());

    Client client = new Client();
    client.setFilterManager(filterManager);

    assertThat(client.sendRequest("HOME")).containsExactly(
            "Authenticating request: HOME",
            "request log: HOME",
            "Executing request: HOME"
    );
  }
}
