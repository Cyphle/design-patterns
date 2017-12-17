package fr.designpatterns.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
  @Override
  public String playVlc(String filename) {
    return "Playing vlc file. Name: "+ filename;
  }

  @Override
  public String playMp4(String filename) {
    // do nothing
    return "";
  }
}
