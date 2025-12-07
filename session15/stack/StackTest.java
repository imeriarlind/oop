package session15.stack;

import session12.BankAccount;
import session12.CurrentAccount;
import session12.SavingsAccount;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(3);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(null);
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());


        Stack<String> stringStack = new Stack<>(4);
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

        Stack<BankAccount> accountStack = new Stack<>(10);
        accountStack.push(new CurrentAccount(1231, "Filani",  0, 100));
        accountStack.push(new SavingsAccount(4567, "Filanja",  0, 5));

        System.out.println(accountStack.pop());
        System.out.println(accountStack.pop());
    }
}
