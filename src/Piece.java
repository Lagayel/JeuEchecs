public class Piece {

    Position position;

    protected int row;
    protected int column;

     Piece(int row, int column){
        this.row = row;
        this.column = column;
    }

    boolean isValidMove(Position newPosition){
        if(newPosition.row>0 && newPosition.column>0 && newPosition.row<=8 && newPosition.column<=8){
            return true;
        } else {
            return false;
        }
    }

}
