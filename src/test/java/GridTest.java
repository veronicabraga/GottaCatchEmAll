import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GridTest {

    private Grid grid;

    @Before
    public void setUp() {
        grid = new Grid();
    }

    @Test
    public void initGridTest() {
        int expected = 1;
        int result = grid.getGrid().size();

        assertEquals(expected, result);
    }

    @Test
    public void initGridCellInfoTest() {
        int[] coordinate = new int[2];
        int value = 0;
        Set<Map.Entry<int[], Integer>> gridSet = grid.getGrid().entrySet();
        for (Map.Entry<int[], Integer> entry : gridSet) {
            coordinate = entry.getKey();
            value = entry.getValue();
        }

        int[] expectedCoordinate = {0, 0};
        int expectedValue = 0;
        boolean result = Arrays.equals(expectedCoordinate, coordinate);

        assertTrue(result);
        assertEquals(expectedValue, value);
    }

    @Test
    public void containsKeyTrue() {
        int[] coordinate = {0, 0};
        boolean result = grid.containsKey(coordinate);

        assertTrue(result);
    }

    @Test
    public void containsKeyFalse() {
        int[] coordinate = {0, 1};
        boolean result = grid.containsKey(coordinate);

        assertFalse(result);
    }

    @Test
    public void addCellTest() {
        int[] coordinate = {0, 1};
        grid.addCell(coordinate, 0);
        int expected = 2;
        int result = grid.getGrid().size();

        assertEquals(expected, result);
    }

    @Test
    public void addCellInfoTest() {
        int[] coordinate = {0, 1};
        int value = 0;
        grid.addCell(coordinate, value);

        boolean result = false;
        int[] expectedCoordinate = {0, 1};
        int expectedValue = 0;

        Set<Map.Entry<int[], Integer>> gridSet = grid.getGrid().entrySet();
        for (Map.Entry<int[], Integer> entry : gridSet) {
            if (Arrays.equals(expectedCoordinate, entry.getKey())) {
                value = entry.getValue();
                result = true;
            }
        }

        assertTrue(result);
        assertEquals(expectedValue, value);
    }
}
