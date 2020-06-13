public class Cannon implements Pieces {
        private int x;
        private int y;
        private boolean isRed;
        private Rank rank;

        public Cannon(int x, int y, boolean isRed, Rank rank) {
            this.x = x;
            this. y = y;
            this.isRed = isRed;
            this.rank = rank;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public boolean getIsRed() {
            return isRed;
        }

        public Rank getRank(){
            return rank;
        }

        public boolean canMoveTo(int x, int y) {
            if (getX() == x && getY() == y || Utils.outOfBoard(x, y)) {
                return false;
            }
            Pieces p = Utils.pieceAt(getX(), getY());
            if (p == null || Utils.selfKilling(getX(), getY(), x, y, p.getIsRed())) {
                return false;
            }
            if (Utils.pieceAt(x, y) == null)
                return Utils.isValidRookMove(getX(), getY(), x, y);
            return Utils.numPiecesBetween(getX(), getY(), x, y) == 1;
        }

        public void moveTo(int x, int y) {
            if (canMoveTo(x, y)) {
                Cannon movingP = (Cannon) Utils.pieceAt(getX(), getY());
                Cannon targetP = (Cannon) Utils.pieceAt(x, y);
                Board.piece.remove(movingP);
                Board.piece.remove(targetP);
                Board.piece.add(new Cannon(x, y, movingP.getIsRed(), movingP.getRank()));
                setX(x);
                setY(y);
            } else {
                System.out.println("\nCan't move!!\n");
            }
        }
}

