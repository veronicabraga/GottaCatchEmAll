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
    public void updateCurrentPositionNTest() {
        int[] coordinate = ash.updateCurrentPosition(Direction.N);
        int[] expected = {-1, 0};
        boolean result = Arrays.equals(expected, coordinate);

        assertTrue(result);
    }


}