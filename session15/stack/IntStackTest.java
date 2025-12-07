package session15.stack;

import session15.stack.exceptions.PeekException;
import session15.stack.exceptions.PopException;
import session15.stack.exceptions.PushException;
import session15.stack.exceptions.StackException;

public class IntStackTest {
    public static void main(String[] args) {
        try {
            IntStack stack = new IntStack(3);
            stack.push(1);
            stack.push(2);
            stack.push(3);
//            stack.push(4);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
        catch(PushException ex)
        {
            System.out.println(ex);
        }
        catch(PopException | PeekException ex)
        {
            ex.printStackTrace();
        }
        catch(StackException ex) {
            System.out.printf("%s: %s%n", ex.getClass().getSimpleName(), ex.getMessage());
        }
    }
}
