package session7;

public class Triangle2 {
    public static void main(String[] args) {
        final int SIDE = 5;
        for (int i = 0; i < SIDE; i++) {
            for (int j =i ; j < SIDE-1; j++) {
                System.out.printf("%-2c", ' ');
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%-2c",'*');
            }
            System.out.println();
        }
    }
}
