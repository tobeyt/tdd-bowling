import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlingGame = new BowlingGame();

    @Test
    void no_throw() {
        assertEquals(0, bowlingGame.getScore());
    }

    @Test
    void one_frame_and_one_throw() {
        bowlingGame.frame(8, 0);
        assertEquals(8, bowlingGame.getScore());
    }

    @Test
    void three_frame_and_on_strike_and_no_spare() {
        bowlingGame.frame(1, 0).frame(3, 3);
        assertEquals(7,bowlingGame.getScore());
    }
}
