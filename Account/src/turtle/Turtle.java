package turtle;

public class Turtle {
    private boolean penIsUp = false;
    private Direction currentDirection = Direction.EAST;
    private TurtlePosition position = new TurtlePosition();

    public boolean penIsUp() {
        return penIsUp;
    }

    public void movePenUp() {
        this.penIsUp = true;
    }

    public void movePenDown() {
        this.penIsUp = false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        this.currentDirection = currentDirection.getRight();
    }

    public void turnLeft() {
        this.currentDirection = currentDirection.getLeft();

    }

    public void moveForward(int position) {
        this.position.increaseColumnPositionBy(position);
    }

    public String getCurrentPosition() {
        return this.position.toString();
    }
}
