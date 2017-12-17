package fr.designpatterns.architectural.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
  private List<Filter> filters = new ArrayList<>();
  private Target target;

  public void addFilter(Filter filter) {
    filters.add(filter);
  }

  public List<String> execute(String request) {
    List<String> output = new ArrayList<>();

    for (Filter filter : filters) {
      output.add(filter.execute(request));
    }
    output.add(target.execute(request));

    return output;
  }

  public void setTarget(Target target) {
    this.target = target;
  }
}
