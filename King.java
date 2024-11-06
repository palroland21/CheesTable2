public class King extends CheesPiece{
    public King(int x, int y, Color color){
        super('K', x, y, color);
    }

    @Override
    public int isValidMove(int new_coordX, int new_coordY, ChessTable board) {
        int dirX = Math.abs(new_coordX - x);
        int dirY = Math.abs(new_coordY - y);
        if( dirX <= 1 && dirY <= 1)
            return 1;
        return 0;
    }
}
