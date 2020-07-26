import java.lang.reflect.Array;


/**
 * Represents the player who will capture the pokemon
 */
public class Ash {

    private Position currentPosition;

    /**
     * Class constructor where it instantiates a {@link Position}
     */
    public Ash() {
        currentPosition = new Position(0, 0);

    }

    /**
     * Sets the currentPosition
     *
     * @param currentPosition the position to set
     */
    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }


    /**
     * Updates the currentPosition's row and col accordingly the movement based in the direction parameter and
     * fills an array with the new row and col
     *
     * @param direction
     * @return an array of int filled with the row and col of the currentPosition
     */
    public int[] updateCurrentPosition(Direction direction) {
        int[] coordinate = {currentPosition.getRow(), currentPosition.getCol()};
        currentPosition.moveInDirection(direction);
        Array.setInt(coordinate, 0, currentPosition.getRow());
        Array.setInt(coordinate, 1, currentPosition.getCol());
        return coordinate;
    }

}
