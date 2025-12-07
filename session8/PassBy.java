package session8;

public class PassBy {
    public static void main(String[] args) {
        int x = 10;
        increment(x);
        System.out.printf("Tani vlera e x ne main eshte %d%n",x);

        int [] arr = new int[3];
        System.out.println("Brenda metodes main");
        ArrayTest.print(arr);
        increment(arr);
        System.out.println("Brenda metodes main tani");
        ArrayTest.print(arr);
    }

    private static void increment(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += (i+1) * 10;
        }
        System.out.println("Brenda metodes increment");
        ArrayTest.print(array);
    }

    private static void increment(int x) {
        System.out.printf("Pranuam vleren e x %d%n", x);
        x += 10;
        System.out.printf("Tani vlera e x eshte %d%n", x);
    }
}
