package fr.designpatterns.architectural.interceptingfilter;

import java.util.List;

public class Client {
  FilterManager filterManager;

  public void setFilterManager(FilterManager filterManager) {
    this.filterManager = filterManager;
  }

  public List<String> sendRequest(String request) {
    return filterManager.filterRequest(request);
  }
}
