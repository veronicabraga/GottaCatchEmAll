import java.lang.reflect.Array;

public class Ash {

    private Position currentPosition;


    public Ash() {
        currentPosition = new Position(0, 0);

    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int[] updateCurrentPosition(Direction direction) {
        int[] coordinate = {currentPosition.getRow(), currentPosition.getCol()};
        currentPosition.moveInDirection(direction);
        Array.setInt(coordinate, 0, currentPosition.getRow());
        Array.setInt(coordinate, 1, currentPosition.getCol());
        return coordinate;
    }

}
