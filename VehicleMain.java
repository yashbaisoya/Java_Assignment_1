import java.util.Scanner;

class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {
    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.5;
    }

    @Override
    public String toString() {
        return "Car " + regNo + " " + brand + " Rent: " + calculateRent();
    }
}

class Bike extends Vehicle {
    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.2;
    }

    @Override
    public String toString() {
        return "Bike " + regNo + " " + brand + " Rent: " + calculateRent();
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] p = line.split(",");

            String type = p[0].trim();
            String reg = p[1].trim();
            String brand = p[2].trim();
            double rate = Double.parseDouble(p[3].trim());

            if (type.equalsIgnoreCase("Car")) {
                Car c = new Car(reg, brand, rate);
                System.out.println(c);
            } else if (type.equalsIgnoreCase("Bike")) {
                Bike b = new Bike(reg, brand, rate);
                System.out.println(b);
            }
        }
    }
}