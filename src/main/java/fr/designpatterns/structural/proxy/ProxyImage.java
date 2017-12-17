package fr.designpatterns.structural.proxy;

public class ProxyImage implements Image {
  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public String display() {
    String add = "";
    if (realImage == null) {
      realImage = new RealImage(fileName);
    } else {
      add = " from cache";
    }
    return realImage.display() + add;
  }
}
