import java.util.Stack;

public class BowlingGame {
    private Stack<Frame> frames = new Stack<>();

    public int getScore() {
        return frames.stream().mapToInt(Frame::score).sum();
    }
}
