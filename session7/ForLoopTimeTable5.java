package session7;

public class ForLoopTimeTable5 {
    public static void main(String[] args) {
        final int ROWS = 10;
        final int COLS = 5;
        for (int row = 1; row <= ROWS ; row++) {
            for (int col = 1; col <= COLS; col++) {
                System.out.printf("%2d * %d = %d\t\t", row, col, row*col);
            }
            System.out.println();
        }
    }
}
