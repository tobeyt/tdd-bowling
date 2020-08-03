public class Frame {
    private final int firstThrow;
    private final int secondThrow;
    private int score;
    private boolean isStrike;
    private boolean isSpare;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isStrike() {
        return isStrike;
    }

    public void setStrike() {
        isStrike = true;
    }

    public boolean isSpare() {
        return isSpare;
    }

    public void setSpare() {
        isSpare = true;
    }

    Frame(int firstThrow, int secondThrow) {
        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
        this.score = firstThrow + secondThrow;
        this.isStrike = false;
        this.isSpare = false;
    }
}
