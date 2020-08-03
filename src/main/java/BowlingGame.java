import java.util.Stack;

public class BowlingGame {
    private Stack<Frame> frames = new Stack<>();

    public BowlingGame frame(int firstThrow, int secondThrow) {
        Frame frame = new Frame(firstThrow, secondThrow);
        frames.push(frame);
        return this;
    }

    public int getScore() {
        return frames.stream().mapToInt(Frame::score).sum();
    }
}
