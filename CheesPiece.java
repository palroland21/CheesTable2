enum Color {
    BLACK, WHITE;
}

public abstract class CheesPiece {
    protected char piece;
    protected Color color;
    protected int x, y;

    public CheesPiece(char pieceName, int x, int y, Color color){
        this.piece = pieceName;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract int isValidMove(int new_coordX, int new_coordY, ChessTable board);

    public char getPiece(){
        return piece;
    }

    public Color getColor(){
        return color;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
