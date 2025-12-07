package session12;

public class CurrentAccount extends BankAccount {
    private int overdraft;

    public CurrentAccount(long accountNumber, String client, double balance, int overdraft) {
        super(accountNumber, client, balance);
        this.overdraft = overdraft;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

//    @Override
//    public void withdraw(int amount)
//    {
//        if(amount <= 0)
//        {
//            System.out.println("Shuma per tu terhjekur duhet te jete pozitive!");
//        }
//        else if (amount > super.getBalance() + overdraft)
//        {
//            System.out.println("Nuk keni mjete te mjaftueshme!");
//        }
//        else {
//            balance -= amount;
//        }
//    }

    @Override
    public double getBalance()
    {
        return super.getBalance() + overdraft;
    }

    @Override
    public String toString() {
        return String.format("%s, overdraft: %d", super.toString(), overdraft);
    }
}
