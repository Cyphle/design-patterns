package fr.designpatterns.behavioral.template;

public class Football extends Game {
  @Override
  String initialize() {
    return "Football Game Initialized! Start playing.";
  }

  @Override
  String startPlay() {
    return "Football Game Started. Enjoy the game!";
  }

  @Override
  String endPlay() {
    return "Football Game Finished!";
  }
}
