package fr.designpatterns.structural.proxy;

public class RealImage implements Image {
  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk(fileName);
  }

  @Override
  public String display() {
    return "Displaying " + fileName;
  }

  private void loadFromDisk(String fileName) {
    System.out.println("Loading " + fileName);
  }
}
