package turtle;

public class TurtlePosition {
    private int row;
    private int column;

    public int getRowPosition(){
        return this.row;
    }

    public void increaseColumnPositionBy(int thisNumeral){
        this.column += thisNumeral;
    }

    public int getColumnPosition(){
        return this.column;
    }

    @Override
    public String toString(){
        String message = "(" +this.row + "," + " " + this.column + ")";
        return message;
    }
}
