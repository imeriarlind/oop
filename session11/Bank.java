package session11;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(System.nanoTime(), "Filani");
        BankAccount account3 = new BankAccount("Dema", System.nanoTime());
        BankAccount account2 = new BankAccount(System.nanoTime(), "Filanja", 100);
        BankAccount account4 = new BankAccount("Demushi", System.nanoTime());
        System.out.println(account1);
        account1.deposit(100);
        System.out.println("Tani Account 1: " + account1);
        account1.withdraw(50);
        System.out.println("Pas terhjekjes 50 Account 1: " + account1);
        account1.withdraw(200);
        System.out.println("Pas terhjekjes 200 Account 1: " + account1);
        System.out.println(account1);
        System.out.println(account3);

        if(account1.equals(account3))
        {
            System.out.printf("%s i barabarte me %s%n", account1, account3);
        }
        else {
            System.out.printf("%s JO i barabarte me %s%n", account1, account3);
        }

        BankAccount [] accounts = new BankAccount[4];
        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;
        accounts[3] = account4;
        System.out.println(" ======================= ");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
