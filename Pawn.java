public class Pawn extends CheesPiece {

    public Pawn(int x, int y, Color color) {
        super('P', x, y, color);
    }

    @Override
    public int isValidMove(int new_coordX, int new_coordY, ChessTable board) {
        int d = (color == Color.BLACK) ? 1 : -1;
        //Move 1 position
        if (new_coordY == y && board.getPiece(new_coordX, new_coordX) == null && new_coordX == x + d)
            return 1;
        //Move 2 position from initial position
        if (new_coordY == y && new_coordX == x + 2 * d && ((color == Color.WHITE && x == 1) || (color == Color.BLACK && x == 6))) {
            return 1;
        }
        // Capture
        if (new_coordX == x + d && (new_coordY - y == 1 || new_coordY - x == -1) && board.getPiece(new_coordX, new_coordY) != null
                && board.getPiece(new_coordX, new_coordY).getColor() != color)
            return 1;
        return 0;
    }
}
