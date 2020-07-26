import org.challenge.Direction;
import org.challenge.Position;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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

    @Test
    public void moveInDirectionNTest() {
        Position positionMock = Mockito.spy(position);
        doNothing().when(positionMock).moveN();
        positionMock.moveInDirection(Direction.N);

        verify(positionMock, times(1) ).moveN();
        verify(positionMock, times(0) ).moveS();
        verify(positionMock, times(0) ).moveE();
        verify(positionMock, times(0) ).moveW();
    }

    @Test
    public void moveInDirectionSTest() {
        Position positionMock = Mockito.spy(position);
        doNothing().when(positionMock).moveS();
        positionMock.moveInDirection(Direction.S);

        verify(positionMock, times(0) ).moveN();
        verify(positionMock, times(1) ).moveS();
        verify(positionMock, times(0) ).moveE();
        verify(positionMock, times(0) ).moveW();
    }

    @Test
    public void moveInDirectionETest() {
        Position positionMock = Mockito.spy(position);
        doNothing().when(positionMock).moveE();
        positionMock.moveInDirection(Direction.E);

        verify(positionMock, times(0) ).moveN();
        verify(positionMock, times(0) ).moveS();
        verify(positionMock, times(1) ).moveE();
        verify(positionMock, times(0) ).moveW();
    }

    @Test
    public void moveInDirectionWTest() {
        Position positionMock = Mockito.spy(position);
        doNothing().when(positionMock).moveW();
        positionMock.moveInDirection(Direction.W);

        verify(positionMock, times(0) ).moveN();
        verify(positionMock, times(0) ).moveS();
        verify(positionMock, times(0) ).moveE();
        verify(positionMock, times(1) ).moveW();
    }
}
