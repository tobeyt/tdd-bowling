import java.util.Stack;

public class BowlingGame {
    private final Stack<Frame> frames = new Stack<>();

    public BowlingGame frame(int firstThrow, int secondThrow) {
        if (!frames.isEmpty()) {
            Frame frame = frames.pop();
            if (frame.isStrike()) {
                frame.setScore(frame.getScore() + firstThrow + secondThrow);
            }
            if (frame.isSpare()) {
                frame.setScore(frame.getScore() + firstThrow);
            }
            frames.push(frame);
        }
        Frame frame = new Frame(firstThrow, secondThrow);
        if (firstThrow == 10) {
            frame.setStrike();
        } else if (firstThrow + secondThrow == 10) {
            frame.setSpare();
        }
        frames.push(frame);
        return this;
    }

    public int getScore() {
        return frames.stream().mapToInt(Frame::getScore).sum();
    }
}
