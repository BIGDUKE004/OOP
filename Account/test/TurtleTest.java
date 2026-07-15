import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.Direction;
import turtle.Turtle;
import turtle.TurtlePosition;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle turtle;
    @BeforeEach
    public void setTurtle(){
        turtle = new Turtle();
    }

    @Test
    public void testThatPenIsUp(){
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void testThatPenIsDown_PenIsNowMovedUp(){
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void testThatPenIsUp_PenIsNowMovedDow(){
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void testThatPenIsDown_TurtleTurnsRight(){
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

    }

    @Test
    public void testThatPenIsDown_TurtleTurnsLeft(){
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleMovesForward(){
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
        turtle.moveForward(1);
        assertEquals("(0, 1)", turtle.getCurrentPosition());
    }

    @Test
    public void testThatTurtleMovesForwardBy(){
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
        turtle.moveForward(2);
        assertEquals("(0, 2)", turtle.getCurrentPosition());
    }

}
