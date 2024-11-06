public class Rook extends CheesPiece{
    public Rook(int x, int y, Color color){
        super('R', x, y, color);
    }

    @Override
    public int isValidMove(int new_coordX, int new_coordY, ChessTable board) {
        int dirX = Math.abs(new_coordX - x);
        int dirY = Math.abs(new_coordY - y);
        if(dirX != 0 && dirY != 0) // Rock go vertical or horizontal
            return 0;
        if(board.isPathClear(x, y, new_coordX, new_coordY) == 1){
            return 1;
        }
        return 0;
    }
}
