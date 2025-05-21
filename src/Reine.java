class Reine extends Piece{

    public Reine(int row, int column) {
        super(row, column);
    }

    boolean isValidMove(Position newPosition){
        if (newPosition.row > 0 && newPosition.column > 0 && newPosition.row <= 8 && newPosition.column <= 8 && ( newPosition.column == this.column || newPosition.row == this.row || Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)))
        {
            return true;
        } else {
            return false;
        }
    }
}