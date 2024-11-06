public class Bishop extends CheesPiece{
    public Bishop(int x, int y, Color color){
        super('B', x, y, color);
    }

    public int isValidMove(int newX, int newY, ChessTable board){
        if ( Math.abs(newX - x) == Math.abs(newY - y)) {
            if(board.isPathClear(x,y, newX, newY) == 1)
                return 1;
        }
        return 0;
    }


}
