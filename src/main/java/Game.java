

public class Game {

    private Grid grid;
    private Ash ash;
    private int points;


    public Game() {
        grid = new Grid();
        ash = new Ash();
        points = 1;
    }

    public int getPoints() {
        return points;
    }


    public void moveAsh(String directions) {
        char[] cardinalPoints = directions.toCharArray();

        for (char character : cardinalPoints) {
            int[] coordinate;

            switch(character) {

                case 'N':
                    coordinate = ash.updateCurrentPosition(Direction.N);
                    handleCells(coordinate);
                    break;

                case 'S':
                    coordinate = ash.updateCurrentPosition(Direction.S);
                    handleCells(coordinate);
                    break;

                case 'E':
                    coordinate = ash.updateCurrentPosition(Direction.E);
                    handleCells(coordinate);
                    break;

                case 'W':
                    coordinate = ash.updateCurrentPosition(Direction.W);
                    handleCells(coordinate);
                    break;

            }
        }
    }

    public void handleCells(int[] coordinate) {
        if (!grid.containsKey(coordinate)) {
            grid.addCell(coordinate, 0);
            points +=1;
        }
    }

}
