package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingCarTest {

    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar("yik");
    }

    @ParameterizedTest
    @ValueSource(ints = { RacingCar.MOVE_ONE_STEP_FORWARD_MIN_VALUE, RacingCar.MOVE_ONE_STEP_FORWARD_MAX_VALUE })
    void moveForwardOneStepTest(int value) {
        assertThat(racingCar.getPosition()).isEqualTo(0);

        racingCar.moveOneStepForwardOrStop(new Value(value));
        assertThat(racingCar.getPosition()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = { RacingCar.STOP_MIN_VALUE, RacingCar.STOP_MAX_VALUE })
    void stopTest(int value) {
        assertThat(racingCar.getPosition()).isEqualTo(0);

        racingCar.moveOneStepForwardOrStop(new Value(value));
        assertThat(racingCar.getPosition()).isEqualTo(0);
    }

    @ParameterizedTest
    @ValueSource(ints = { -1, 10, -100, 50 })
    @DisplayName("값이 범위를 벗어나면 예외가 발생한다.")
    void valueOutOfRangeExceptionTest(int value) {
        assertThatThrownBy(() -> racingCar.moveOneStepForwardOrStop(new Value(value))).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = { "", "abcdef", "yooinkeun" })
    @DisplayName("이름이 없거나 5자가 넘으면 예외가 발생한다.")
    void invalidNameExceptionTest(String name) {
        assertThatThrownBy(() -> new RacingCar(name)).isInstanceOf(IllegalArgumentException.class);
    }
}
