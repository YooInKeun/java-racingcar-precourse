public class RacingCar {
    public static final int STOP_MIN_VALUE = 0;
    public static final int STOP_MAX_VALUE = 3;
    public static final int MOVE_ONE_STEP_FORWARD_MIN_VALUE = 4;
    public static final int MOVE_ONE_STEP_FORWARD_MAX_VALUE = 9;

    private static final String VALUE_OUT_OF_RANGE_EXCEPTION_MESSAGE = String.format(
            "값은 %d이상 %d이하 또는 %d이상 %d이하 이어야 합니다.",
            STOP_MIN_VALUE, STOP_MAX_VALUE, MOVE_ONE_STEP_FORWARD_MIN_VALUE, MOVE_ONE_STEP_FORWARD_MAX_VALUE
    );

    private RacingCarPosition racingCarPosition;

    public RacingCar() {
        this.racingCarPosition = new RacingCarPosition();
    }

    public void react(int value) {
        validateValue(value);

        if (isValueMoveOneStepForwardRange(value)) {
            moveOneStepForward();
        }
    }

    private void validateValue(int value) {
        if (isValueOutOfRange(value)) {
            throw new IllegalArgumentException(VALUE_OUT_OF_RANGE_EXCEPTION_MESSAGE);
        }
    }

    private boolean isValueOutOfRange(int value) {
        return !isValueStopRange(value) && !isValueMoveOneStepForwardRange(value);
    }

    private boolean isValueStopRange(int value) {
        return value >= STOP_MIN_VALUE && value <= STOP_MAX_VALUE;
    }

    private boolean isValueMoveOneStepForwardRange(int value) {
        return value >= MOVE_ONE_STEP_FORWARD_MIN_VALUE && value <= MOVE_ONE_STEP_FORWARD_MAX_VALUE;
    }

    private void moveOneStepForward() {
        racingCarPosition.increaseOne();
    }

    public int getPosition() {
        return racingCarPosition.getPosition();
    }
}
