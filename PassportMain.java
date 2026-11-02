import java.util.Scanner;

class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo + " Issue: " + issueDate + " Expiry: " + expiryDate;
    }
}

class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    public Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name + " DOB: " + dob + " Address: " + address + "\n" + passport.toString();
    }
}

public class PassportMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String[] cParts = line1.split(",");

        String line2 = sc.nextLine();
        String[] pParts = line2.split(",");

        Passport pass = new Passport(pParts[0].trim(), pParts[1].trim(), pParts[2].trim());
        Citizen cz = new Citizen(cParts[0].trim(), cParts[1].trim(), cParts[2].trim(), pass);

        System.out.println(cz);
    }
}