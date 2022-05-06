package racingcar.domain;

public class Car {
    private static final int INITIAL_POSITION = 0;

    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car(String name) {
        this.name = name;
        this.position = INITIAL_POSITION;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.isMovable()) {
            position++;
        }
    }

    public boolean isSamePosition(int position) {
        return this.position == position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
