package session14.singleton;

public class Counter {
    private int count = 0;
    private static Counter counter;

    static {
        counter = new Counter();
    }

    private Counter() {
        super();
    }

    public int getCount()
    {
        return ++count;
    }

    public static Counter getInstance()
    {
        return counter;
    }
}
