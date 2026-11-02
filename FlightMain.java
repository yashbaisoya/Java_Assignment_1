import java.util.Scanner;

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getAirline() { return airline; }
    public double getFare() { return fare; }

    public abstract double calculateFare();

    @Override
    public String toString() {
        return "Flight No: " + flightNumber + " Airline: " + airline + " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {
    public DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}

class InternationalFlight extends Flight {
    public InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.25);
    }
}

public class FlightMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] p = line.split(",");
            String type = p[0].trim();
            String fNo = p[1].trim();
            String air = p[2].trim();
            double baseFare = Double.parseDouble(p[3].trim());

            Flight f;
            if (type.equalsIgnoreCase("Domestic")) {
                f = new DomesticFlight(fNo, air, baseFare);
            } else {
                f = new InternationalFlight(fNo, air, baseFare);
            }
            System.out.println(f);
        }
    }
}