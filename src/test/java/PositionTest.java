import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    private Position position;

    @Before
    public void setUp() {

        position = new Position(0, 0);
    }

    @Test
    public void moveNTest() {
        position.moveN();
        int expected = -1;
        int result = position.getRow();

        assertEquals(expected, result);
    }

    @Test
    public void moveSTest() {
        position.moveS();
        int expected = 1;
        int result = position.getRow();

        assertEquals(expected, result);
    }

    @Test
    public void moveETest() {
        position.moveE();
        int expected = 1;
        int result = position.getCol();

        assertEquals(expected, result);
    }

    @Test
    public void moveWTest() {
        position.moveW();
        int expected = -1;
        int result = position.getCol();

        assertEquals(expected, result);
    }

    /*@Test
    public void moveInDirectionTest() {
        position.moveInDirection(Direction.N);
        int expected = 1;
        int result = position.getCol();

        assertEquals(expected, result);
    }*/
}
