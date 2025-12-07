package session12;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(long accountNumber, String client, double balance, double interestRate) {
        super(accountNumber, client, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getBalance() {
//        return super.getBalance()/100 * interestRate + super.getBalance();
        return (1 + interestRate/100) * super.getBalance();
    }

    @Override
    public String toString() {
        return String.format("%s, interestRate: %.2f%%", super.toString(), interestRate);
    }
}
