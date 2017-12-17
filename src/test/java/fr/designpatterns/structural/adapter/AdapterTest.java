package fr.designpatterns.structural.adapter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterTest {
  @Test
  public void should_adapt_audio_player_to_mp4_and_vlc() throws Exception {
    AudioPlayer audioPlayer = new AudioPlayer();

    assertThat(audioPlayer.play("mp3", "beyond the horizon.mp3")).isEqualTo("Playing mp3 file. Name: beyond the horizon.mp3");
    assertThat(audioPlayer.play("mp4", "alone.mp4")).isEqualTo("Playing mp4 file. Name: alone.mp4");
    assertThat(audioPlayer.play("vlc", "far far away.vlc")).isEqualTo("Playing vlc file. Name: far far away.vlc");
    assertThat(audioPlayer.play("avi", "mind me.avi")).isEqualTo("Invalid media. avi format not supported");
  }
}
