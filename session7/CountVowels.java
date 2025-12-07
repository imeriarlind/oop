package session7;

import java.util.Scanner;

//Kerko tekst nga shfrytezuesi deri sa nuk shtyp Termino
// Numero sa fjali i kishin se paku 3 zanore
//Shfaq rezultatin ne fund
public class CountVowels {
    public static void main(String[] args) {
        banner();
        Scanner sc = new Scanner(System.in);
        final String SENTINEL = "Termino";
        String text;
        int count = 0, countTotal = 0;

        do {
            System.out.printf("Shtyp tekst ose %s per te perfunduar: ", SENTINEL);
            text = sc.nextLine();
            if (!text.equalsIgnoreCase(SENTINEL)) {
                countTotal++;
                if (CountVowels.has3Vowels(text)) {
                    count++;
                }
            }
        } while (!text.equalsIgnoreCase(SENTINEL));

        if (countTotal == 0) {
            System.out.println("Nuk ke shtyp asnje fjali!");
        } else {
            System.out.printf("Ishin %d fjali qe kishin nga tri e me shume zanore%n", count);
        }
    }

    private static void banner() {
        System.out.println("Mieresevini ne programin tone!");
    }

    private static boolean has3Vowels(String line) {
        int length = line.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = line.charAt(i);
            if (isVowel(ch)) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    //switch expression
    private static boolean isVowel(char ch) {
        return switch (Character.toLowerCase(ch)) {
            case 'a', 'e', '\u00EB', 'i', 'o', 'u', 'y' -> true;
            default -> false;
        };
    }
}
