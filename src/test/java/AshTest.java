import org.challenge.Ash;
import org.challenge.Direction;
import org.challenge.Position;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AshTest {

    private Ash ash;

    @Before
    public void setUp() {
        ash = new Ash();
    }

    @Test
    public void updateCurrentPositionCallNTest() {
        Position currentPositionMock = mock(Position.class);
        ash.setCurrentPosition(currentPositionMock);

        doNothing().when(currentPositionMock).moveInDirection(Direction.N);
        ash.updateCurrentPosition(Direction.N);

        verify(currentPositionMock, times(2) ).getRow();
        verify(currentPositionMock, times(2) ).getCol();

    }

    @Test
    public void updateCurrentPositionCallSTest() {
        Position currentPositionMock = mock(Position.class);
        ash.setCurrentPosition(currentPositionMock);

        doNothing().when(currentPositionMock).moveInDirection(Direction.S);
        ash.updateCurrentPosition(Direction.S);

        verify(currentPositionMock, times(2) ).getRow();
        verify(currentPositionMock, times(2) ).getCol();

    }

    @Test
    public void updateCurrentPositionCallETest() {
        Position currentPositionMock = mock(Position.class);
        ash.setCurrentPosition(currentPositionMock);

        doNothing().when(currentPositionMock).moveInDirection(Direction.E);
        ash.updateCurrentPosition(Direction.E);

        verify(currentPositionMock, times(2) ).getRow();
        verify(currentPositionMock, times(2) ).getCol();

    }

    @Test
    public void updateCurrentPositionCallWTest() {
        Position currentPositionMock = mock(Position.class);
        ash.setCurrentPosition(currentPositionMock);

        doNothing().when(currentPositionMock).moveInDirection(Direction.W);
        ash.updateCurrentPosition(Direction.W);

        verify(currentPositionMock, times(2) ).getRow();
        verify(currentPositionMock, times(2) ).getCol();

    }

    @Test
    public void updateCurrentPositionNTest() {
        int[] coordinate = ash.updateCurrentPosition(Direction.N);
        int[] expected = {-1, 0};
        boolean result = Arrays.equals(expected, coordinate);

        assertTrue(result);
    }
    @Test
    public void updateCurrentPositionSTest() {
        int[] coordinate = ash.updateCurrentPosition(Direction.S);
        int[] expected = {1, 0};
        boolean result = Arrays.equals(expected, coordinate);

        assertTrue(result);
    }

    @Test
    public void updateCurrentPositionETest() {
        int[] coordinate = ash.updateCurrentPosition(Direction.E);
        int[] expected = {0, 1};
        boolean result = Arrays.equals(expected, coordinate);

        assertTrue(result);
    }

    @Test
    public void updateCurrentPositionWTest() {
        int[] coordinate = ash.updateCurrentPosition(Direction.W);
        int[] expected = {0, -1};
        boolean result = Arrays.equals(expected, coordinate);

        assertTrue(result);
    }
}