public class Utils {
    // Check piece is out of board
    public static boolean outOfBoard(int col, int row) {
        return col < 0 || col > 8 || row < 0 || row > 9;
    }

    // Check straight move
    public static boolean isStraight(int fromCol, int fromRow, int toCol, int toRow) {
        return fromCol == toCol || fromRow == toRow;
    }

    // Check diagonal move
    public static boolean isDiagonal(int fromCol, int fromRow, int toCol, int toRow) {
        return Math.abs(fromCol - toCol) == Math.abs(fromRow - toRow);
    }

    // Move one step.
    public static int steps(int fromCol, int fromRow, int toCol, int toRow) {
        if (fromCol == toCol) {
            return Math.abs(fromRow - toRow);
        } else if (fromRow == toRow) {
            return Math.abs(fromCol - toCol);
        } else if (isDiagonal(fromCol, fromRow, toCol, toRow)) {
            return Math.abs(fromRow - toRow);
        }
        return 0;
    }

    // Palace of king
    public static boolean outOfPalace(int col, int row, boolean isRed) {
        if (isRed) {
            return col < 3 || col > 5 || row < 0 || row > 2;
        } else {
            return col < 3 || col > 5 || row < 7 || row > 9;
        }
    }

    // Check side of board
    public static boolean selfSide(int row, boolean isRed) {
        return isRed ? row <= 4 : row >= 5;
    }

    public static Pieces pieceAt(int col, int row) {
        for (Pieces pieces : Board.piece) {
            if (pieces.getX() == col && pieces.getY() == row) {
                return pieces;
            }
        }
        return null;
    }

    public static int numPiecesBetween(int fromCol, int fromRow, int toCol, int toRow) {
        if (!Utils.isStraight(fromCol, fromRow, toCol, toRow)
                || Utils.steps(fromCol, fromRow, toCol, toRow) < 2) {
            return 0;
        }
        int cnt = 0, head, tail;
        if (fromCol == toCol) { // vertical
            head = Math.min(fromRow, toRow);
            tail = Math.max(fromRow, toRow);
            for (int row = head + 1; row < tail; row++) {
                cnt += (pieceAt(fromCol, row) == null) ? 0 : 1;
            }
        } else {
            head = Math.min(fromCol, toCol);
            tail = Math.max(fromCol, toCol);
            for (int col = head + 1; col < tail; col++) {
                cnt += (pieceAt(col, fromRow) == null) ? 0 : 1;
            }
        }
        return cnt;
    }

    public static boolean selfKilling(int fromCol, int fromRow, int toCol, int toRow, boolean isRed) {
        Pieces target = pieceAt(toCol, toRow);
        return target != null && target.getIsRed() == isRed;
    }

    public static boolean isValidRookMove(int fromCol, int fromRow, int toCol, int toRow) {
        return Utils.isStraight(fromCol, fromRow, toCol, toRow)
                && Utils.numPiecesBetween(fromCol, fromRow, toCol, toRow) == 0;
    }
}