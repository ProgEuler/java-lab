public class TransactionThread extends Thread {

    private final BankAccount account;
    private final double amount;

    public TransactionThread(String name, BankAccount account, double amount) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.updateBalance(amount);
    }
}
