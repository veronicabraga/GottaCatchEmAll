import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Grid {

    private Map<int[], Integer> grid;

    public Grid() {
        grid = new HashMap<>();
        initGrid();
    }

    public void initGrid() {
        int[] coordinate = {0,0};
        grid.put(coordinate, 0);
    }

    public Map<int[], Integer> getGrid() {
        return grid;
    }

    public boolean containsKey(int[] coordinate) {
        Set<Map.Entry<int[], Integer>> gridSet = grid.entrySet();
        for (Map.Entry<int[], Integer> entry : gridSet) {
            if (Arrays.equals(entry.getKey(), coordinate)) {
                return true;
            }
        }
        return false;
    }

    public void addCell(int[] coordinate, int point) {
        grid.put(coordinate, point);
    }

}
