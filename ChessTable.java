public class ChessTable {
    private CheesPiece[][] board;
    private final int ROWS = 8;
    private final int COLS = 8;

    public ChessTable() {
        this.board = new CheesPiece[ROWS][COLS];
    }

    private int isValidMove(int x, int y) {
        if (x >= 0 && x < 8 && y >= 0 && y < 8)
            return 1;
        else
            return 0;
    }

    public void showBoard() {
        System.out.print("  ");
        for (int k = 0; k < 8; k++)
            System.out.print(k);

        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if (getPiece(i, j) == null)
                    System.out.print("_");
                else
                    System.out.print(getPiece(i, j).getPiece());
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setPieceOnBoard(CheesPiece newPiece, int x, int y) {
        if (isValidMove(newPiece.getX(), newPiece.getY()) == 0) {
            System.out.println("The coordonate is invalid! Out of bounds!");
            return;
        }
        board[x][y] = newPiece;
    }

    public void initBoard() {
        // BLACK pieces
        board[0][0] = new Rook(0, 0, Color.BLACK);
        board[0][1] = new Knight(0, 1, Color.BLACK);
        board[0][2] = new Bishop(0, 2, Color.BLACK);
        board[0][3] = new Queen(0, 3, Color.BLACK);
        board[0][4] = new King(0, 4, Color.BLACK);
        board[0][5] = new Bishop(0, 5, Color.BLACK);
        board[0][6] = new Knight(0, 6, Color.BLACK);
        board[0][7] = new Rook(0, 7, Color.BLACK);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(1, i, Color.BLACK);
        }

        // WHITE pieces
        board[7][0] = new Rook(7, 0, Color.WHITE);
        board[7][1] = new Knight(7, 1, Color.WHITE);
        board[7][2] = new Bishop(7, 2, Color.WHITE);
        board[7][3] = new Queen(7, 3, Color.WHITE);
        board[7][4] = new King(7, 4, Color.WHITE);
        board[7][5] = new Bishop(7, 5, Color.WHITE);
        board[7][6] = new Knight(7, 6, Color.WHITE);
        board[7][7] = new Rook(7, 7, Color.WHITE);

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(6, i, Color.WHITE);
        }
    }


    public CheesPiece getPiece(int x, int y) {
        if (isValidMove(x, y) == 0) {
            System.out.println("The coordonate is invalid! Out of bounds!");
            return null;
        }
        return board[x][y];
    }

    public void removePieceFromBoard(int x, int y) {
        if (isValidMove(x, y) == 0) {
            System.out.println("The coordonate is invalid! Out of bounds!");
            return;
        }
        board[x][y] = null;
    }

    public void movePiece(CheesPiece piece, int newX, int newY) {
        if (isValidMove(newX, newY) == 0) {
            System.out.println("The coordonate is invalid! Out of bounds!");
            return;
        }
        if (piece == null) {
            System.out.println("Is not piece at " + piece.getX() + "-" + piece.getY() + " position!");
            return;
        }
        if (piece.isValidMove(newX, newY, this) == 1) {

            setPieceOnBoard(piece, newX, newY);
            removePieceFromBoard(piece.getX(), piece.getY());
            piece.setPosition(newX, newY);
            System.out.println("Moved succesfully!");
            return;
        } else {
            System.out.println("Invalid move!");
            return;
        }
    }

    public int isPathClear(int x, int y, int newX, int newY) {
        if (isValidMove(x, y) == 0 || isValidMove(newX, newY) == 0) {
            System.out.println("The coordonate is invalid! Out of bounds!");
            return 0;
        }
        int directionX = Integer.signum(newX - x);
        int directionY = Integer.signum(newY - y);

        int currentX = x + directionX;
        int currentY = y + directionY;

        while (currentX != newX || currentY != newY) {
            if (getPiece(currentX, currentY) != null)
                return 0;
            currentX += directionX;
            currentY += directionY;
        }
        return 1;
    }

}
