public class Knight extends CheesPiece{
    public Knight(int x, int y, Color color){
        super('N', x, y, color);
    }

    @Override
    public int isValidMove(int new_coordX, int new_coordY, ChessTable board) {
        int dirX = Math.abs(new_coordX - x);
        int dirY = Math.abs(new_coordY - y);

        if( (dirX == 2 && dirY == 1)  || (dirX == 1 && dirY == 2))
            return 1;

        return 0;
    }
}
