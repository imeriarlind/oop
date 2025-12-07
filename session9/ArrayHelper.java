package session9;

import java.util.Arrays;

public class ArrayHelper {
    public static void main(String[] args) {
        int [] x = {1, 2, 3};
        int [] y = {1, 2, 3};
//        print(x);
        System.out.printf("%s [%d]%n", Arrays.toString(x), System.identityHashCode(x));
        System.out.printf("%s [%d]%n", Arrays.toString(y), System.identityHashCode(y));

        if(x == y)
        {
            System.out.println("x i barbarte me y");
        }
        else if (x.equals(y))
        {
            System.out.println("x i barbarte me equals me y");
        }
        else if (Arrays.equals(x, y))
        {
            System.out.println("x i barbarte me Arrays.equals me y");
        }
        else
        {
            System.out.println("x jo i barbarte me y");
        }

//        x = resize(x);
        x = Arrays.copyOf(x, x.length + 1);
        x[x.length - 1] = 4;

        System.out.printf("Tani %s [%d]%n", Arrays.toString(x), System.identityHashCode(x));

        int [] z = {7,2,9,4,15,1};
        System.out.printf("z=%s [%d]%n", Arrays.toString(z), System.identityHashCode(z));
        Arrays.sort(z);
        System.out.printf("Pas sortimit z=%s [%d]%n", Arrays.toString(z), System.identityHashCode(z));
    }

    private static int []  resize(int[] arr) {
        int [] arrNew = new int [arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }

    private static void print(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("%d ", ints[i]);
        }
        System.out.println();
    }
}
