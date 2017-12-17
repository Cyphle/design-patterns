package fr.designpatterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {
  AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String audioType) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer = new Mp4Player();
    }
  }

  @Override
  public String play(String audioType, String filename) {
    if (audioType.equalsIgnoreCase("vlc")) {
      return advancedMediaPlayer.playVlc(filename);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      return advancedMediaPlayer.playMp4(filename);
    }
    return "";
  }
}
