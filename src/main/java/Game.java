import java.lang.reflect.Array;

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

            switch(character) {

                case 'N':
                    ash.getCurrentPosition().moveInDirection(Direction.N);
                    System.out.println(ash.getCurrentPosition().getRow() + ", " + ash.getCurrentPosition().getCol());
                    Array.setInt(position, 0, ash.getCurrentPosition().getRow());
                    Array.setInt(position, 1, ash.getCurrentPosition().getCol());

                    if (!grid.gridContainsKey(position)) {
                        grid.addCell(position, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

                case 'S':
                    ash.getCurrentPosition().moveInDirection(Direction.S);

                    System.out.println(ash.getCurrentPosition().getRow() + ", " + ash.getCurrentPosition().getCol());

                    Array.setInt(position, 0, ash.getCurrentPosition().getRow());
                    Array.setInt(position, 1, ash.getCurrentPosition().getCol());

                    if (!grid.gridContainsKey(position)) {
                        grid.addCell(position, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

                case 'E':
                    ash.getCurrentPosition().moveInDirection(Direction.E);

                    System.out.println(ash.getCurrentPosition().getRow() + ", " + ash.getCurrentPosition().getCol());

                    Array.setInt(position, 0, ash.getCurrentPosition().getRow());
                    Array.setInt(position, 1, ash.getCurrentPosition().getCol());

                    if (!grid.gridContainsKey(position)) {
                        grid.addCell(position, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

                case 'W':
                    ash.getCurrentPosition().moveInDirection(Direction.W);

                    System.out.println(ash.getCurrentPosition().getRow() + ", " + ash.getCurrentPosition().getCol());

                    Array.setInt(position, 0, ash.getCurrentPosition().getRow());
                    Array.setInt(position, 1, ash.getCurrentPosition().getCol());

                    if (!grid.gridContainsKey(position)) {
                        grid.addCell(position, 0);
                        points +=1;
                    }
                    System.out.println(points);
                    break;

            }


        }
    }

}
