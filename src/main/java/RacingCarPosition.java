public class RacingCarPosition {
    private static final int DEFAULT_POSITION = 0;
    private static final int ONE_STEP = 1;

    private int position;

    RacingCarPosition() {
        position = DEFAULT_POSITION;
    }

    public void increaseOne() {
        position += ONE_STEP;
    }

    public int getPosition() {
        return position;
    }
}
