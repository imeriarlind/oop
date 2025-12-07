package session8;

import java.util.Arrays;

public class InitialisingList {
    public static void main(String[] args) {
//        String [] seasons = new String[4];
        String [] seasons = {"Vjeshta", "Dimri", "Pranvera", "Vera"};
//        seasons[0] = "Vjeshta";
//        seasons[1] = "Dimri";
//        seasons[2] = "Pranvera";
//        seasons[3] = "Vera";
        print(seasons);
        seasons = new String[]{"Autumn", "Winter", "Spring", "Summer"};
        System.out.println("Pas ndryshimit");
        print(seasons);
    }

    private static void print(String[] array) {
        System.out.printf("ID = %d%n", System.identityHashCode(array));
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s%n", array[i]);
        }
    }

}
