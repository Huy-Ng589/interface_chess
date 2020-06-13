public interface Pieces {
    enum Rank {
        ROOK,
        KNIGHT,
        BISHOP,
        GUARD,
        KING,
        CANNON,
        PAWN
    }
    Rank rank = null;

    boolean canMoveTo(int x, int y);
    void moveTo(int x, int y);
    boolean getIsRed();
    int getX();
    int getY();
    Rank getRank();
}
