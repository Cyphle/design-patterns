package fr.designpatterns.behavioral.template;

public class Cricket extends Game {
  @Override
  String initialize() {
    return "Cricket Game Initialized! Start playing.";
  }

  @Override
  String startPlay() {
    return "Cricket Game Started. Enjoy the game!";
  }

  @Override
  String endPlay() {
    return "Cricket Game Finished!";
  }
}
