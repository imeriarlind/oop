package session7;

public class ForTest {
    public static void main(String[] args) {
//        for( int count = 0; count < 10; count++ ) {
//            System.out.println(count+1);
//        }

//        int count = 0;
//        for( ; ; ) {
//            System.out.println(++count);
//            if(count == 10) {
//                break;
//            }
//        }

        for(int count = 0, dec = 10; count < 10 && dec > 0; count++, dec -= 2 ) {
            System.out.println(count+1);
        }
    }
}
