package fr.designpatterns.creational.abstractfactory;

public class Blue implements Color {
  @Override
  public String fill() {
    return "Inside Blue::fill() method.";
  }
}
