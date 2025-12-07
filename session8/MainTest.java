package session8;

public class MainTest {
    public static void main(String[] args) {
        System.out.printf("Gjatesia e array %d%n",args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argument %d: %s%n",i,args[i]);
        }
    }
}
