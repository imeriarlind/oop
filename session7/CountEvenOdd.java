package session7;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EXIT = -9999;
        int num;
        int countOdd = 0;
        int countEven = 0;
        do {
            System.out.printf("Shtyp numra (int) ose %d per te perfunduar: ", EXIT);
            num = sc.nextInt();
            if(num % 2 == 0)
            {
                countEven++;
            }
            else if (num != EXIT)
            {
                countOdd++;
            }
        } while(num != EXIT);

        int sum = countEven + countOdd;
        System.out.printf("U shtypen %d numra cift dhe %d numra tek, %.2f%% jane cfit dhe %.2f%% jane tek", countEven, countOdd,
                (double)countEven/sum*100, (double)countOdd/sum*100);
    }
}
