package session4;

public class Conversion {
    public static void main(String[] args) {
        int x = 5;
        int z = 2;
        double y = x;
        System.out.println("x = "+x+", y = "+y);

        int a = 10;
        double b = 2.5;
        double c = a / b;
        System.out.println(a+"/"+b+"="+ c);

        byte b1 = 125;
        short sh1 = 124;
        int r1 = b1 + sh1;
        System.out.println(b1+"+"+sh1+"="+ r1);

        System.out.println(x+" + "+z+" =  "+  (x+z));
        System.out.println(x+" / "+z+" =  "+ (double)x/z);
        System.out.println(x+" % "+z+" =  "+ x % z);
        
        int value = (int)b;
        System.out.println("value = " + value);

        byte bt = (byte)130; //127 + 2
        System.out.println("bt = " + bt);
        
        char ch1 = 'A'; //65
        System.out.println("ch1 = " + ch1 + " ka shifren: "+(int)ch1);
        
        int v = 'B';
        System.out.println("v = " + v);
        
        char c1 = 97;
        System.out.println("c1 = " + c1);

        
    }
}

/*
1) Nese ndonjeri operand eshte double, rezultati eshte double
2) Nese ndonjeri operand eshte float, rezultati eshte float
3) Nese ndonjeri operand eshte long, rezultati eshte long
4) Perndryshe rezultati eshte int
*/
