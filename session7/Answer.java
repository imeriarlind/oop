package session7;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shtyp Po ose Jo: ");

        String answer = scan.next();
        switch(answer.toUpperCase()){
            case "PO":
                System.out.println("Pergjigja e sakte ishte "+answer);
                break;
            case "JO":
                System.out.println("Pergjigja e dhene ishte "+answer);
                break;
            default:
                System.out.println("Pergjigja e dhene ishte gabim!!!!");
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
