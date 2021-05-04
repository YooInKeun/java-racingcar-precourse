package racingcar;

import com.sun.tools.javac.util.List;

public class RacingCars {
    private static final int RACING_CARS_FIRST_INDEX = 0;

    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }

    public void play(RandomGenerator randomGenerator) {
        for (int i = RACING_CARS_FIRST_INDEX; i < racingCars.size(); i++) {
            racingCars.get(i).moveOneStepForwardOrStop(new Value(randomGenerator.generate()));
        }
    }
}
