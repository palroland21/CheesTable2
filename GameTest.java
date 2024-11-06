import java.util.Scanner;

public class GameTest {
    public static void main(String[] argv){
        ChessTable board = new ChessTable();
        board.initBoard();
        board.showBoard();

        /*
        board.setPieceOnBoard(new Queen(4,4, Color.BLACK),4, 4 );
        board.setPieceOnBoard(new King(2,7, Color.BLACK), 2, 7);
        board.setPieceOnBoard(new Queen(4,5, Color.BLACK), 4, 5);
        board.showBoard();

        CheesPiece pawn1 = board.getPiece(1,0);
        System.out.print(pawn1.getPiece() + " de pe pozitia " + pawn1.getX() + "-" + pawn1.getY() + " pe 2-0: " );
        board.movePiece(pawn1, 2, 0);

        CheesPiece pawn2 = board.getPiece(1,1);
        System.out.print(pawn2.getPiece() + " de pe pozitia " + pawn2.getX() + "-" + pawn2.getY() + " pe 2-0: " );
        board.movePiece(pawn2, 2, 0);

        CheesPiece pawn3 = board.getPiece(1,1);
        System.out.print(pawn3.getPiece() + " de pe pozitia " + pawn3.getX() + "-" + pawn3.getY() + " pe 2-1: " );
        board.movePiece(pawn3, 2, 1);

        CheesPiece knight = board.getPiece(0,1);
        System.out.print(knight.getPiece() + " de pe pozitia " + knight.getX() + "-" + knight.getY() + " pe 2-0: " );
        board.movePiece(knight, 2, 0);

        CheesPiece knight2 = board.getPiece(7,1);
        System.out.print(knight2.getPiece() + " de pe pozitia " + knight2.getX() + "-" + knight2.getY() + " pe 7-2: " );
        board.movePiece(knight2, 7, 2);

        CheesPiece queen1 = board.getPiece(4,4);
        System.out.print(queen1.getPiece() + " de pe pozitia " + queen1.getX() + "-" + queen1.getY() + " pe 5-3: " );
        board.movePiece(queen1, 5, 3);

        CheesPiece queen2 = board.getPiece(4,5);
        System.out.print(queen2.getPiece() + " de pe pozitia " + queen2.getX() + "-" + queen2.getY() + " pe 5-7: " );
        board.movePiece(queen2, 5, 7);

        CheesPiece rook1 = board.getPiece(0,0);
        System.out.print(rook1.getPiece() + " de pe pozitia " + rook1.getX() + "-" + rook1.getY() + " pe 0-7: " );
        board.movePiece(rook1, 0, 7);

        CheesPiece rook2 = board.getPiece(0,0);
        System.out.print(rook2.getPiece() + " de pe pozitia " + rook2.getX() + "-" + rook2.getY() + " pe 0-2: " );
        board.movePiece(rook2, 0, 2);

        CheesPiece king1 = board.getPiece(2,7);
        System.out.print(king1.getPiece() + " de pe pozitia " + king1.getX() + "-" + king1.getY() + " pe 1-7: " );
        board.movePiece(king1, 1, 7);

        CheesPiece king2 = board.getPiece(7,4);
        System.out.print(king2.getPiece() + " de pe pozitia " + king2.getX() + "-" + king2.getY() + " pe 7-2: " );
        board.movePiece(king2, 7, 2);

        board.showBoard();
        */

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Piesa de pe pozitia: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.print("Sa se mute pe pozitia: ");
            int newX = scanner.nextInt();
            int newY = scanner.nextInt();
            board.movePiece(board.getPiece(x,y), newX, newY);
            board.showBoard();
        }
    }
}
