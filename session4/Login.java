package session4;

import java.io.Console;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Console console = System.console();
        System.out.print("Enter your username: ");
//        String username = console.readLine();
        String username = scan.nextLine();
        System.out.print("Enter your password: ");
        String password = new String(console.readPassword());

        System.out.println("username = "+username+", password = " + password);
    }
}
