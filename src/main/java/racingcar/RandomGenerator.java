package racingcar;

import java.util.Random;

public class RandomGenerator {
    private final Random random;

    RandomGenerator() {
        this.random = new Random();
    }

    int generate() {
        return random.nextInt(RacingCar.MAX_VALUE) + RacingCar.MIN_VALUE;
    }
}
