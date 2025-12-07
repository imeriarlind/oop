package session8;

public class ArrayTest {
    public static void main(String[] args) {
        int[] x = new int[3];
        print(x);
//        x[0] = 10;
//        x[1] = 20;
//        x[2] = 30;
        for(int i=0; i<3; i++)
        {
            x[i] = (i+1) * 10;
        }

        System.out.println("Pas inicializimit");
        print(x);

        System.out.println("Po e shtypim y");
        int[] y = new int[2];
        print(y);

    }

    public static void print(int[] arr)
    {
        System.out.printf("Gjatesia e array %d dhe id = %d \n", arr.length, System.identityHashCode(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("x[%d] = %d%n", i, arr[i]);
        }
    }
}
