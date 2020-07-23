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
            int[] position = {ash.getCurrentPosition().getRow(), ash.getCurrentPosition().getCol()};
            int[] coordinate;
            switch(character) {

                case 'N':

                   coordinate = ash.updateCurrentPosition(Direction.N);

                    if (!grid.containsKey(coordinate)) {
                        grid.addCell(coordinate, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

                case 'S':
                    coordinate = ash.updateCurrentPosition(Direction.S);

                    if (!grid.containsKey(coordinate)) {
                        grid.addCell(coordinate, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

                case 'E':
                    coordinate = ash.updateCurrentPosition(Direction.E);

                    if (!grid.containsKey(coordinate)) {
                        grid.addCell(coordinate, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

                case 'W':
                    coordinate = ash.updateCurrentPosition(Direction.W);

                    if (!grid.containsKey(coordinate)) {
                        grid.addCell(coordinate, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

            }


        }
    }

}
