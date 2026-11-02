import java.util.Scanner;

abstract class Loan {
    protected double principal;
    protected double rate;
    protected double time;

    public Loan(double principal, double time) {
        this.principal = principal;
        this.time = time;
    }

    public abstract double calculateInterest();
}

class HomeLoan extends Loan {
    public HomeLoan(double principal, double time) {
        super(principal, time);
        this.rate = 8.0;
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100.0;
    }
}

class CarLoan extends Loan {
    public CarLoan(double principal, double time) {
        super(principal, time);
        this.rate = 10.0;
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100.0;
    }
}

public class LoanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] p = line.split(",");
            String type = p[0].trim();
            double pAmt = Double.parseDouble(p[1].trim());
            double t = Double.parseDouble(p[2].trim());

            if (type.equalsIgnoreCase("Home")) {
                HomeLoan hl = new HomeLoan(pAmt, t);
                System.out.println("Home Loan Interest: " + hl.calculateInterest());
            } else if (type.equalsIgnoreCase("Car")) {
                CarLoan cl = new CarLoan(pAmt, t);
                System.out.println("Car Loan Interest: " + cl.calculateInterest());
            }
        }
    }
}