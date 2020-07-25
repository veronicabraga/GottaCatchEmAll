import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void handleCellsTestAddPoint() {
        int[] coordinate = {0, 1};
        game.handleCells(coordinate);
        int expectedPoints = 2;

        assertEquals(expectedPoints, game.getPoints());
    }

    @Test
    public void handleCellsTestAddNoPoint() {
        int[] coordinate = {0, 0};
        game.handleCells(coordinate);
        int expectedPoints = 1;

        assertEquals(expectedPoints, game.getPoints());
    }

    @Test
    public void handleCellsTestNoKey() {
        Grid mockGrid = mock(Grid.class);
        game.setGrid(mockGrid);

        int[] coordinate = {0, 1};
        when(mockGrid.containsKey(coordinate)).thenReturn(false);
        doNothing().when(mockGrid).addCell(coordinate, 0);
        game.handleCells(coordinate);
        int expectedPoints = 2;

        verify(mockGrid, times(1)).containsKey(coordinate);
        verify(mockGrid, times(1)).addCell(coordinate, 0);
        assertEquals(expectedPoints, game.getPoints());

    }

    @Test
    public void handleCellsTestWithKey() {
        Grid mockGrid = mock(Grid.class);
        game.setGrid(mockGrid);

        int[] coordinate = {0, 0};
        when(mockGrid.containsKey(coordinate)).thenReturn(true);
        game.handleCells(coordinate);
        int expectedPoints = 1;

        verify(mockGrid, times(1)).containsKey(coordinate);
        verify(mockGrid, times(0)).addCell(coordinate, 0);
        assertEquals(expectedPoints, game.getPoints());

    }
}
