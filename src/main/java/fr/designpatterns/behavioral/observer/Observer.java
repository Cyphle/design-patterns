package fr.designpatterns.behavioral.observer;

public abstract class Observer {
  protected Subject subject;
  public abstract String update();
}
