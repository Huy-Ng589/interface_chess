
public class Test_Program {
    public static void main(String[] args) {
        Board board = new Board();
        Rook r1 = new Rook(0, 0, true, Pieces.Rank.ROOK);
        Rook r2 = new Rook(8, 0, true, Pieces.Rank.ROOK);
        Horse h1 = new Horse(1, 0, true, Pieces.Rank.KNIGHT);
        Horse h2 = new Horse(7, 0, true, Pieces.Rank.KNIGHT);
        Bishop b1 = new Bishop(2, 0, true, Pieces.Rank.BISHOP);
        Bishop b2 = new Bishop(6, 0, true, Pieces.Rank.BISHOP);
        Guard g1 = new Guard(3, 0, true, Pieces.Rank.GUARD);
        Guard g2 = new Guard(5, 0, true, Pieces.Rank.GUARD);
        Cannon c1 = new Cannon(1,2, true, Pieces.Rank.CANNON);
        Cannon c2 = new Cannon(7,2, true, Pieces.Rank.CANNON);
        King k1 = new King(4, 0, true, Pieces.Rank.KING);

        King k2 = new King(4, 9, false, Pieces.Rank.KING);
        Rook r3 = new Rook(0, 9, false, Pieces.Rank.ROOK);
        Rook r4 = new Rook(8, 9, false, Pieces.Rank.ROOK);
        Horse h3 = new Horse(1, 9, false, Pieces.Rank.KNIGHT);
        Horse h4 = new Horse(7, 9, false, Pieces.Rank.KNIGHT);
        Bishop b3 = new Bishop(2, 9, false, Pieces.Rank.BISHOP);
        Bishop b4 = new Bishop(6, 9, false, Pieces.Rank.BISHOP);
        Guard g3 = new Guard(3, 9, false, Pieces.Rank.GUARD);
        Guard g4 = new Guard(5, 9, false, Pieces.Rank.GUARD);
        Cannon c3 = new Cannon(1,7, false, Pieces.Rank.CANNON);
        Cannon c4 = new Cannon(7,7, false, Pieces.Rank.CANNON);






        // Move piece.
        System.out.println("After move: ");


        System.out.println(board);
    }
}
