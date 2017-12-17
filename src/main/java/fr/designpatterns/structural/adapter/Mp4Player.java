package fr.designpatterns.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
  @Override
  public String playVlc(String filename) {
    // do nothing
    return "";
  }

  @Override
  public String playMp4(String filename) {
    return "Playing mp4 file. Name: " + filename;
  }
}
