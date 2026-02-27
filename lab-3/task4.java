class Account {
    private double balance;
    protected String accountNumber;

    public Account(String accNum, double bal) {
        this.accountNumber = accNum;
        this.balance = bal;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accNum, double bal, double rate) {
        super(accNum, bal);
    }

    public void testAccess() {
        //  CAN access protected member
        System.out.println("Account Number: " + accountNumber);

        // CANNOT access private member directly
        // System.out.println("Balance: " + balance); // COMPILE ERROR!

        // ✅ Must use getter
      //   System.out.println("Balance: " + getBalance());
    }
}

public class task4 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", 5000.0, 5.5);
        sa.testAccess();
    }
   }
