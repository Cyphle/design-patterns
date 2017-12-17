package fr.designpatterns.behavioral.visitor;

public interface ComputerPart {
  public void accept(ComputerPartVisitor computerPartVisitor);
}
