package turtle;

public enum Direction {

    NORTH("WEST", "EAST"),
    EAST("NORTH", "SOUTH"),
    SOUTH("EAST", "WEST"),
    WEST("SOUTH", "NORTH");

    private String left;
    private String right;

    Direction(String left, String right){
        this.left = left;
        this.right = right;
    }

    public Direction getLeft(){
        return Direction.valueOf(left);
    }

    public Direction getRight(){
        return Direction.valueOf(right);
    }
}
