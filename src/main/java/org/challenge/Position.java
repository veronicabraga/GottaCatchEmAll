package org.challenge;

/**
 * Represents a position in a grid of columns and rows
 */
public class Position {

    private int row;
    private int col;


    /**
     * Class constructor specifying the row and col numbers of the position.
     *
     * @param row
     * @param col
     */
    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * @return row
     */
    public int getRow() {
        return row;
    }

    /**
     * @return col
     */
    public int getCol() {
        return col;
    }

    /**
     * To move to North it decreases the row number
     */
    public void moveN() {
        this.row -= 1;
    }

    /**
     * To move to South it increases the row number
     */
    public void moveS() {
        this.row += 1;
    }

    /**
     * To move to East it increases the col number
     */
    public void moveE() {
        this.col += 1;
    }

    /**
     * To move to West it decreases the col number
     */
    public void moveW() {
        this.col -= 1;
    }

    /**
     * Verifies which method of movement must be call accordingly the direction
     *
     * @param direction the direction to move
     */
    public void moveInDirection(Direction direction) {

        switch (direction) {

            case N:
                moveN();
                break;
            case S:
                moveS();
                break;
            case E:
                moveE();
                break;
            case W:
                moveW();
                break;
        }
    }

}
