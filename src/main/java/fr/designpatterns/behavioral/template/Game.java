package fr.designpatterns.behavioral.template;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
  abstract String initialize();

  abstract String startPlay();

  abstract String endPlay();

  //template method
  public final List<String> play() {
    List<String> moves = new ArrayList<>();

    //initialize the game
    moves.add(initialize());
    //start game
    moves.add(startPlay());
    //end game
    moves.add(endPlay());

    return moves;
  }
}
