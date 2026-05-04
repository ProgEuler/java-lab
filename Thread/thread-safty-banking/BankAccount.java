public class BankAccount {

    private double balance;
    private volatile boolean isLocked = false;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void updateBalance(double amount) {
        if (isLocked) {
            System.out.println(
                Thread.currentThread().getName() +
                    " blocked -- account is locked."
            );
            return;
        }
        double before = balance;
        balance += amount;
        System.out.printf(
            "%s | Before: %.2f | Change: %.2f | After: %.2f%n",
            Thread.currentThread().getName(),
            before,
            amount,
            balance
        );
    }

    public synchronized void triggerLockdown() {
        isLocked = true;
        System.out.println("Emergency lockdown triggered!");
    }

    public double getBalance() {
        return balance;
    }
}
