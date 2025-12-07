package session15.stack;

import session15.stack.exceptions.PeekException;
import session15.stack.exceptions.PopException;
import session15.stack.exceptions.PushException;
import session15.stack.exceptions.StackException;

public class IntStack {
    private int[] data;
    private int index;

    public IntStack(int capacity) throws StackException {

        if(capacity <= 0) {
            throw new StackException("Stack kerkon se paku nje element!");
        }
        data = new int[capacity];
    }

    public void push(int value) throws PushException {
        if(index >= data.length) {
            throw new PushException(String.format("Elementi %d nuk u ruajt ne stack!", value));
        }
        data[index++] = value;
    }

    public int pop() throws PopException {
        if(index == 0) {
            throw new PopException("Metoda pop: Nuk ka asnje element!");
        }
        return data[--index];
    }

    public int peek() throws PeekException {
        if(index == 0)
        {
            throw new PeekException("Metoda peek: Nuk ka asnje element!");
        }

        return data[index-1];
    }
}
