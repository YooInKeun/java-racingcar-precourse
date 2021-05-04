package racingcar;

public class RacingCarName {
    private static final String NAME_EQUAL_TO_EMPTY_MESSAGE = "이름이 비어있을 수 없습니다.";
    private static final int MAX_NAME_LENGTH = 5;
    private static final String NAME_OVER_MAX_LENGTH_MESSAGE = String.format("이름은 %d자 이하여야 합니다.", MAX_NAME_LENGTH);

    private String name;

    RacingCarName(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        validateNotEmptyName(name);
        validateNameLength(name);
    }

    private void validateNotEmptyName(String name) {
        if (isNameEmpty(name)) {
            throw new IllegalArgumentException(NAME_EQUAL_TO_EMPTY_MESSAGE);
        }
    }

    private boolean isNameEmpty(String name) {
        return name == null || name.isEmpty();
    }

    private void validateNameLength(String name) {
        if (isNameLengthOverMaxLength(name)) {
            throw new IllegalArgumentException(NAME_OVER_MAX_LENGTH_MESSAGE);
        }
    }

    private boolean isNameLengthOverMaxLength(String name) {
        return name.length() > MAX_NAME_LENGTH;
    }
}
