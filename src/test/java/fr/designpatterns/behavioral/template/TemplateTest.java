package fr.designpatterns.behavioral.template;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateTest {
  @Test
  public void should_template() throws Exception {
    Game game = new Cricket();
    assertThat(game.play()).containsExactly(
            "Cricket Game Initialized! Start playing.",
            "Cricket Game Started. Enjoy the game!",
            "Cricket Game Finished!"
    );

    game = new Football();
    assertThat(game.play()).containsExactly(
            "Football Game Initialized! Start playing.",
            "Football Game Started. Enjoy the game!",
            "Football Game Finished!"
    );
  }
}
