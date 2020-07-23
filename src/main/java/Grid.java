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
        int[] position = {0,0};
        grid.put(position, 0);
    }


    public boolean gridContainsKey(int[] position) {
        Set<Map.Entry<int[], Integer>> gridSet = grid.entrySet();
        for (Map.Entry<int[], Integer> entry : gridSet) {
            if (Arrays.equals(entry.getKey(), position)) {
                return true;
            }
        }
        return false;
    }

    public void addCell(int[] position, int point) {
        grid.put(position, point);
    }

}
