package session15.stack;

public class Stack <T>{
    private T[] data;
    private int index;

    public Stack(int capacity) {
        data = (T[])new Object[capacity];
    }

    public void push(T value)
    {
        if(value != null &&  index < data.length)
        {
            data[index++] = value;
        }
    }

    public T pop()
    {
        if(index > 0)
        {
            return data[--index];
        }
        return null;
    }

    public T peek()
    {
        if(index > 0)
        {
            return data[index-1];
        }
        return null;
    }
}
