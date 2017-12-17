package fr.designpatterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {
  MediaAdapter mediaAdapter;

  @Override
  public String play(String audioType, String filename) {
    //inbuilt support to play mp3 music files
    if (audioType.equalsIgnoreCase("mp3")) {
      return "Playing mp3 file. Name: " + filename;
    }
    //mediaAdapter is providing support to play other file formats
    else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
      mediaAdapter = new MediaAdapter(audioType);
      return mediaAdapter.play(audioType, filename);
    }
    return "Invalid media. " + audioType + " format not supported";
  }
}
