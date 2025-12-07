package session12;

public abstract class BankAccount {
    private long accountNumber;
    private String client;
    private double balance;

    public BankAccount(long accountNumber, String client)
    {
        this.accountNumber = accountNumber;
        this.client = client;
//        this(accountNumber, client, 0.0);
    }

    public BankAccount(String client, long accountNumber)
    {
        this(accountNumber, client);
    }

    public BankAccount(long accountNumber, String client, double balance) {
        this(accountNumber, client);
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void deposit(int amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
        else {
            System.out.println("Shuma e depozituar duhet te jete pozitive!");
        }
    }

    public void withdraw(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Shuma per tu terhjekur duhet te jete pozitive!");
        }
        else if (amount > getBalance())
        {
            System.out.println("Nuk keni mjete te mjaftueshme!");
        }
        else {
            balance -= amount;
        }
    }

    @Override
    public String toString()
    {
//        return "["+accountNumber+"] - "+client+": "+balance;
        return String.format("%s [%d] - client: %S balance: %.2f", getClass().getSimpleName(), accountNumber, client, getBalance());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BankAccount account)
        {
            return account.accountNumber == accountNumber;
//            BankAccount account = (BankAccount) obj;
        }
        return false;
    }

}
