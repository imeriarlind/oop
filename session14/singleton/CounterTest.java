package session14.singleton;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());

        System.out.println("--------------");
        Counter counter1 = Counter.getInstance();
        System.out.println(counter1.getCount());
        System.out.println(counter1.getCount());
        System.out.println(counter1.getCount());

    }
}
