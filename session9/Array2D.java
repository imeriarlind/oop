package session9;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr = new int [3][];
        arr[0] = new int[]{1,2};
        arr[1] = new int[]{5,6,8};
        arr[2] = new int[]{10};

        int [][] arr2 = {{1,2},{5,6,8},{10}};
//        print(arr);
        System.out.printf("%s [%d]%n", Arrays.deepToString(arr), System.identityHashCode(arr));

        if(Arrays.deepEquals(arr,arr2))
        {
            System.out.println("arr equals to arr2");
        }
        else {
            System.out.println("arr NOT equals to arr2");
        }
    }

    private static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            print(array[i]);
        }
    }

    private static void print(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("[%d] = %d%n", i, ints[i]);
        }
    }
}
