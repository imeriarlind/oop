package session7;

import java.util.Scanner;

public class SemaforiSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final byte E_KUQE = 0, E_VERDHE = 1, E_GJELBER = 2;
        System.out.printf("Shtyp %d - kuqe ose %d - verdhe ose %d - gjelber: ", E_KUQE, E_VERDHE, E_GJELBER);

        int ngjyra = scan.nextInt();
        switch(ngjyra){
            case E_KUQE:
                int x = 0;
                x = 10;
                System.out.println("Ndal! " + x);
                break;
            case E_VERDHE:
                x = 20;
                System.out.println("Behu gati! " + x);
                break;
            case E_GJELBER:
                System.out.println("Nisu!!");
                break;
            default:
                System.out.println("Ngjyra e dhene eshte gabim!!!!");
                break;
        }
        System.out.println(".....");
//        if(ngjyra == E_KUQE){
//            System.out.println("Ndalu!");
//        } else if (ngjyra == E_VERDHE){
//            System.out.println("Behu gati!");
//        } else if (ngjyra == E_GJELBER){
//            System.out.println("Nisu!!");
//        } else {
//            System.out.println("Ngjyra e dhene eshte gabim!!!!");
//        }
    }
}
