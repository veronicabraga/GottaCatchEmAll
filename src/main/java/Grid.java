import java.util.HashMap;
import java.util.Map;

public class Grid {

    private Map<int[], Integer> grid;

    private Grid() {
        grid = new HashMap<>();
    }

    public void initGrid() {
        int[] position = {0,0};
        grid.put(position, 1);
    }

    public Map<int[], Integer> getGrid() {
        return grid;
    }

}
