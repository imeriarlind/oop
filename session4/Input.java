package session4;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        new Scanner("TUng juve nga BAFF");
        Scanner scan = new Scanner(System.in);
        System.out.print("Shtypni moshen: ");
        int age = scan.nextInt();
        System.out.println("Mosha: "+age);
        scan.nextLine();//Empty buffer
        System.out.print("Shtypni emrin: ");
        String name = scan.nextLine();
//        String name = scan.next();
//        System.out.println(name+" tash do t'i testojme operatoret aritmetik");

        System.out.print("Shtypni vleren e x: ");
        int x = scan.nextInt();

        System.out.print("Shtypni vleren e y: ");
        int y = scan.nextInt();

        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println(x+" - "+y+" = "+(x-y));
        System.out.println(x+" * "+y+" = "+(x*y));
        System.out.println(x+" / "+y+" = "+((double)x/y));
        System.out.println(x+" % "+y+" = "+(x%y));
    }
}

//scan.nextLine() e lexon nje rresht te tere
//scan.next() lexon nje token (fjale)
//scan.nextByte() lexon inputin dhe e trajton si byte
//scan.nextShort() lexon inputin dhe e trajton si short
//scan.nextInt() lexon inputin dhe e trajton si int
//scan.nextLong() lexon inputin dhe e trajton si long
//scan.nextFloat() lexon inputin dhe e trajton si float
//scan.nextDouble() lexon inputin dhe e trajton si double
//scan.nextBoolean() lexon inputin dhe e trajton si boolean
