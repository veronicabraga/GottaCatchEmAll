package org.challenge;

public class Game {

    private Grid grid;
    private Ash ash;
    private int points;

    /**
     * Class constructor where it instantiates a {@link Grid}, an {@link Ash} and grants value to points
     */
    public Game() {
        grid = new Grid();
        ash = new Ash();
        points = 1;
    }

    /**
     * @return points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Sets the grid
     *
     * @param grid the grid to set
     */
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * Sets the ash
     *
     * @param ash the ash to set
     */
    public void setAsh(Ash ash) {
        this.ash = ash;
    }

    /**
     * Moves ash accordingly the directions parameter
     *
     * @param directions
     */
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


    /**
     * Adds a cell in the grid and increase points if the grid does not contain the key(coordinate)
     *
     * @param coordinate
     */
    public void handleCells(int[] coordinate) {
        if (!grid.containsKey(coordinate)) {
            grid.addCell(coordinate, 0);
            points +=1;
        }
    }
}
