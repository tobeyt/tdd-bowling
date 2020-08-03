import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void no_throw() {
        BowlingGame bowlingGame = new BowlingGame();
        assertEquals(0, bowlingGame.getScore());
    }
}
