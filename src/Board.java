import java.util.ArrayList;
import java.util.List;

public class Board {
    final static int ROWS = 10;
    final static int COLS = 9;
    static List<Pieces> piece = new ArrayList<>();

    public Board() {
        for (int i = 0; i < 2; i++) {
            piece.add(new Rook(0 + i * 8, 0, true, Pieces.Rank.ROOK));
            piece.add(new Horse(1 + i * 6, 0, true, Pieces.Rank.KNIGHT));
            piece.add(new Bishop(2 + i * 4, 0, true, Pieces.Rank.BISHOP));
            piece.add(new Guard(3 + i * 2, 0, true, Pieces.Rank.GUARD));
            piece.add(new Cannon(1 + i * 6, 2, true, Pieces.Rank.CANNON));

            piece.add(new Rook(0 + i * 8, 9, false, Pieces.Rank.ROOK));
            piece.add(new Horse(1 + i * 6, 9, false, Pieces.Rank.KNIGHT));
            piece.add(new Bishop(2 + i * 4, 9, false, Pieces.Rank.BISHOP));
            piece.add(new Guard(3 + i * 2, 9, false, Pieces.Rank.GUARD));
            piece.add(new Cannon(1 + i * 6, 7, false, Pieces.Rank.CANNON));
        }
        piece.add(new King(4, 0, true, Pieces.Rank.KING));
        piece.add(new King(4, 9, false, Pieces.Rank.KING));
        for (int i = 0; i < 5; i++) {
            piece.add(new Pawn(i * 2, 3, true, Pieces.Rank.PAWN));
            piece.add(new Pawn(i * 2, 6, false, Pieces.Rank.PAWN));
        }
    }

    public String toString() {
        String brdStr = "";
        brdStr += "   ";
        for (int i = 0; i < COLS; i++) {
            brdStr += "   " + i;
        }
        brdStr += "\n\n";
        for (int row = 0; row < ROWS; row++) {
            brdStr += row + "  ";
            for (int col = 0; col < COLS; col++) {
                Pieces p = Utils.pieceAt(col, row);
                if (p == null) {
                    brdStr += "   .";
                } else {
                    switch (p.getRank()) {
                        case ROOK: brdStr += p.getIsRed() ? "   R": "   r"; break;
                        case KNIGHT: brdStr += p.getIsRed() ? "   H" : "   h"; break;
                        case BISHOP: brdStr += p.getIsRed() ? "   B" : "   b"; break;
                        case GUARD: brdStr += p.getIsRed() ? "   G" : "   g"; break;
                        case KING: brdStr += p.getIsRed() ? "   K" : "   k"; break;
                        case CANNON: brdStr += p.getIsRed() ? "   C" : "   c"; break;
                        case PAWN: brdStr += p.getIsRed() ? "   P" : "   p"; break;
                    }
                }
            }
            brdStr += "\n";
        }
        return brdStr;
    }
}
