import java.util.Scanner;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    public Account(String accNo, String holderName, double initialBalance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class AtmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("101", "User", 0.0);

        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] p = line.split(" ");
            String cmd = p[0];

            if (cmd.equalsIgnoreCase("deposit")) {
                acc.deposit(Double.parseDouble(p[1]));
            } else if (cmd.equalsIgnoreCase("withdraw")) {
                acc.withdraw(Double.parseDouble(p[1]));
            } else if (cmd.equalsIgnoreCase("getBalance")) {
                System.out.println("Balance: " + acc.getBalance());
            }
        }
    }
}