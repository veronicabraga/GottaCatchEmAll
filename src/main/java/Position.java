public class Position {

    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void moveN() {
        this.row -= 1;
    }

    public void moveS() {
        this.row += 1;
    }

    public void moveE() {
        this.col += 1;
    }

    public void moveW() {
        this.col -= 1;
    }

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
