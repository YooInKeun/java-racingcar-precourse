public class RacingCar {
    public static final int STOP_MIN_VALUE = 0;
    public static final int STOP_MAX_VALUE = 3;
    public static final int MOVE_ONE_STEP_FORWARD_MIN_VALUE = 4;
    public static final int MOVE_ONE_STEP_FORWARD_MAX_VALUE = 9;
    private static final String VALUE_OUT_OF_RANGE_MESSAGE = String.format(
            "값은 %d이상 %d이하 또는 %d이상 %d이하 이어야 합니다.",
            STOP_MIN_VALUE, STOP_MAX_VALUE, MOVE_ONE_STEP_FORWARD_MIN_VALUE, MOVE_ONE_STEP_FORWARD_MAX_VALUE
    );

    private RacingCarPosition position;

    public RacingCar() {
        this.position = new RacingCarPosition();
    }

    public void moveOneStepForwardOrStop(Value value) {
        validateValue(value);

        if (isValueMoveOneStepForwardRange(value)) {
            moveOneStepForward();
        }
    }

    private void validateValue(Value value) {
        if (isValueOutOfRange(value)) {
            throw new IllegalArgumentException(VALUE_OUT_OF_RANGE_MESSAGE);
        }
    }

    private boolean isValueOutOfRange(Value value) {
        return !isValueStopRange(value) && !isValueMoveOneStepForwardRange(value);
    }

    private boolean isValueStopRange(Value value) {
        return value.isGreaterThanOrEqual(STOP_MIN_VALUE) && value.isLessThanOrEqual(STOP_MAX_VALUE);
    }

    private boolean isValueMoveOneStepForwardRange(Value value) {
        return value.isGreaterThanOrEqual(MOVE_ONE_STEP_FORWARD_MIN_VALUE) && value.isLessThanOrEqual(MOVE_ONE_STEP_FORWARD_MAX_VALUE);
    }

    private void moveOneStepForward() {
        position.increaseOne();
    }

    public int getPosition() {
        return position.getPosition();
    }
}
