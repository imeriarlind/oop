package session9;

public class Array2DFunctions {
    public static void main(String[] args) {
        int [][] arr2 = {{1,2},{5,6,8},{10}};

        System.out.println("shuma e array: "+ sum2D(arr2));
        int [][] arr3 =new int[3][];
        System.out.println("shuma e array: "+ sum2D(arr3));

    }

    private static int sum2D(int[][] arr2) {
        int sum = 0;
        if(arr2 != null)
        {
            for(int i = 0; i < arr2.length; i++){
                sum += sum1D(arr2[i]);
            }
        }
        return sum;
    }

    private static int sum1D(int[] arr) {
        int sum = 0;
        if(arr != null)
        {
            for (int i = 0; i < arr.length; i++){
                sum +=  arr[i];
            }
        }
        return sum;
    }
}
