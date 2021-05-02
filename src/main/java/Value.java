public class Value {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    boolean isGreaterThanOrEqual(int value) {
        return this.value >= value;
    }

    boolean isLessThanOrEqual(int value) {
        return this.value <= value;
    }
}
