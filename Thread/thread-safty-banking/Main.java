import java.io.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000.00);

        TransactionThread t1 = new TransactionThread(
            "Thread-Deposit",
            account,
            +500.00
        );
        TransactionThread t2 = new TransactionThread(
            "Thread-Withdraw",
            account,
            -200.00
        );
        TransactionThread t3 = new TransactionThread(
            "Thread-Fee",
            account,
            -15.00
        );

        t1.start(); // runnable
        t2.start();

        Thread.sleep(1);
        account.triggerLockdown();

        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.printf("%nFinal balance: %.2f%n", account.getBalance());
    }
}
