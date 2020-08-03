public class Frame {
    private int firstThrow;
    private int secondThrow;

    Frame(int firstThrow, int secondThrow){
        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
    }

    public int score() {
        int score = firstThrow + secondThrow;

        return score;
    }
}
