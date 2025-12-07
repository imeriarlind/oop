package session12;

public class BankTest {
    public static void main(String[] args) {
        CurrentAccount ca1 = new CurrentAccount(System.nanoTime(), "Filan Fistekut", 100, 200);
        ca1.withdraw(50);
        ca1.withdraw(100);

        SavingsAccount sa1 = new SavingsAccount(System.nanoTime(), "Filanja", 100, 5.00);
        sa1.deposit(100);

//        BankAccount ba = new BankAccount(System.nanoTime(), "Dema", 300);
//        ba.withdraw(50);

        BankAccount [] accounts = new BankAccount[3];
        accounts[0] = ca1;
        accounts[1] = sa1;
//        accounts[2] = ba;

        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
