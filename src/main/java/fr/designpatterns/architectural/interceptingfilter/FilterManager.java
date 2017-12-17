package fr.designpatterns.architectural.interceptingfilter;

import java.util.List;

public class FilterManager {
  FilterChain filterChain;

  public FilterManager(Target target) {
    filterChain = new FilterChain();
    filterChain.setTarget(target);
  }

  public void setFilter(Filter filter) {
    filterChain.addFilter(filter);
  }

  public List<String> filterRequest(String request) {
    return filterChain.execute(request);
  }
}
