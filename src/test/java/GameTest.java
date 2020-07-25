import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void moveAshTestN() {
        Ash mockAsh = mock(Ash.class);
        game.setAsh(mockAsh);
        Game mockGame = Mockito.spy(game);

        int[] coordinate = {-1, 0};
        when(mockAsh.updateCurrentPosition(Direction.N)).thenReturn(coordinate);
        doNothing().when(mockGame).handleCells(coordinate);
        mockGame.moveAsh("N");

        verify(mockAsh, times(1)).updateCurrentPosition(Direction.N);
        verify(mockGame, times(1)).handleCells(coordinate);
    }

    @Test
    public void moveAshTestS() {
        Ash mockAsh = mock(Ash.class);
        game.setAsh(mockAsh);
        Game mockGame = Mockito.spy(game);

        int[] coordinate = {0, -1};
        when(mockAsh.updateCurrentPosition(Direction.S)).thenReturn(coordinate);
        doNothing().when(mockGame).handleCells(coordinate);
        mockGame.moveAsh("S");

        verify(mockAsh, times(1)).updateCurrentPosition(Direction.S);
        verify(mockGame, times(1)).handleCells(coordinate);
    }

    @Test
    public void moveAshTestE() {
        Ash mockAsh = mock(Ash.class);
        game.setAsh(mockAsh);
        Game mockGame = Mockito.spy(game);

        int[] coordinate = {0, 1};
        when(mockAsh.updateCurrentPosition(Direction.E)).thenReturn(coordinate);
        doNothing().when(mockGame).handleCells(coordinate);
        mockGame.moveAsh("E");

        verify(mockAsh, times(1)).updateCurrentPosition(Direction.E);
        verify(mockGame, times(1)).handleCells(coordinate);
    }

    @Test
    public void moveAshTestW() {
        Ash mockAsh = mock(Ash.class);
        game.setAsh(mockAsh);
        Game mockGame = Mockito.spy(game);

        int[] coordinate = {-1, 0};
        when(mockAsh.updateCurrentPosition(Direction.W)).thenReturn(coordinate);
        doNothing().when(mockGame).handleCells(coordinate);
        mockGame.moveAsh("W");

        verify(mockAsh, times(1)).updateCurrentPosition(Direction.W);
        verify(mockGame, times(1)).handleCells(coordinate);
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
