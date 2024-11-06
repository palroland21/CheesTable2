public class Queen extends CheesPiece {
    public Queen(int x, int y, Color color) {
        super('Q', x, y, color);
    }

    @Override
    public int isValidMove(int new_coordX, int new_coordY, ChessTable board) {
        if(Math.abs(new_coordX - x) == Math.abs(new_coordY - y) || (Math.abs(new_coordX - x) == 0 || Math.abs(new_coordY - y) == 0)){ // Diagonal OR Straight path
            if(board.isPathClear(x, y, new_coordX, new_coordY) == 1)
                return 1;
        }
        return 0;
    }
}
