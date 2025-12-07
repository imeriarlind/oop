package session7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Shtyp nje shkronje: ");
        String line = scanner.nextLine();
		
        char ch = nextChar(line);
//        char ch = 'e';
        switch(Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'ë':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.printf("%c eshte zanore", ch);
                break;
            default:
                System.out.printf("%c NUK eshte zanore!", ch);
        }
    }

    public static char nextChar(String line){        
        if(line.length() == 1){
            return line.charAt(0);
        }
        throw new InputMismatchException();
    }
}

