public class RacingCarPosition {
    private static final int ONE_STEP = 1;

    private int position;

    public void increaseOne() {
        position += ONE_STEP;
    }

    public int getPosition() {
        return position;
    }
}
