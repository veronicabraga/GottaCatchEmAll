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
                    gridContainsKey(coordinate);
                    break;

                case 'S':
                    coordinate = ash.updateCurrentPosition(Direction.S);
                    gridContainsKey(coordinate);
                    break;

                case 'E':
                    coordinate = ash.updateCurrentPosition(Direction.E);
                    gridContainsKey(coordinate);
                    break;

                case 'W':
                    coordinate = ash.updateCurrentPosition(Direction.W);
                    gridContainsKey(coordinate);
                    break;

            }
        }
    }

    public void gridContainsKey(int[] coordinate) {
        if (!grid.containsKey(coordinate)) {
            points +=1;
        }
    }

}
