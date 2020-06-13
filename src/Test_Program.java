import java.util.Scanner;

public class Test_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Board board = new Board();
        Rook rook = new Rook(0, 0, true, Pieces.Rank.ROOK);
        Rook rook1 = new Rook(8, 0, true, Pieces.Rank.ROOK);
        Horse horse = new Horse(1, 0, true, Pieces.Rank.KNIGHT);
        Horse horse1 = new Horse(7, 0, true, Pieces.Rank.KNIGHT);

        Rook rook2 = new Rook(0, 9, false, Pieces.Rank.ROOK);
        Rook rook3 = new Rook(8, 9, false, Pieces.Rank.ROOK);
        Horse horse2 = new Horse(1, 9, false, Pieces.Rank.KNIGHT);
        Horse horse3 = new Horse(7, 9, false, Pieces.Rank.KNIGHT);




        System.out.println("After move: ");
        System.out.println(board);
    }
}
