package fr.designpatterns.creational.abstractfactory;

public class Red implements Color {
  @Override
  public String fill() {
    return "Inside Red::fill() method.";
  }
}
