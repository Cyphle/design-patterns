package fr.designpatterns.architectural.compositeentity;

import java.util.ArrayList;
import java.util.List;

public class Client {
  private CompositeEntity compositeEntity = new CompositeEntity();

  public List<String> printData() {
    List<String> output = new ArrayList<>();

    for (int i = 0; i < compositeEntity.getData().length; i++) {
      output.add("Data: " + compositeEntity.getData()[i]);
    }

    return output;
  }

  public void setData(String data1, String data2) {
    compositeEntity.setData(data1, data2);
  }
}
