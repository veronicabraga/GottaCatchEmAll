import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Represents the grid where the character Ash will move to capture pokemon
 */
public class Grid {

    private Map<int[], Integer> grid;


    /**
     * Class constructor where it instantiates a Hashmap and calls the initGrid method
     */
    public Grid() {
        grid = new HashMap<>();
        initGrid();
    }

    /**
     * Adds the first element in the map that represents a cell(key) in the grid and it's point(value)
     */
    public void initGrid() {
        int[] coordinate = {0,0};
        grid.put(coordinate, 0);
    }

    /**
     * @return grid
     */
    public Map<int[], Integer> getGrid() {
        return grid;
    }

    /**
     * Verifies if the grid contains a key accordingly the coordinate parameter
     *
     * @param coordinate an array of int
     */
    public boolean containsKey(int[] coordinate) {
        Set<Map.Entry<int[], Integer>> gridSet = grid.entrySet();
        for (Map.Entry<int[], Integer> entry : gridSet) {
            if (Arrays.equals(entry.getKey(), coordinate)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds an element in the map that represents a cell(key) in the grid and it's point(value)
     *
     * @param coordinate an array of int that represents the row and col numbers
     * @param point the value. Created with 0: the pokemon has been captured
     */
    public void addCell(int[] coordinate, int point) {
        grid.put(coordinate, point);
    }

}
