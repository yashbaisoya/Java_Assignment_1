import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Guest {
    private String name;
    private int age;
    private String idProof;

    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + idProof;
    }
}

class Reservation {
    private String resId;
    private String roomType;
    private List<Guest> guests;

    public Reservation(String resId, String roomType) {
        this.resId = resId;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public void addGuest(Guest g) {
        guests.add(g);
    }

    @Override
    public String toString() {
        String res = "Reservation ID: " + resId + " Room: " + roomType + "\nGuests:\n";
        for (Guest g : guests) {
            res += g.toString() + "\n";
        }
        return res.trim();
    }
}

public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String[] rParts = line1.split(",");
        String resId = rParts[0].trim();
        String roomType = rParts[1].trim();
        int n = Integer.parseInt(rParts[2].trim());

        Reservation r = new Reservation(resId, roomType);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] gParts = line.split(",");
            Guest g = new Guest(gParts[0].trim(), Integer.parseInt(gParts[1].trim()), gParts[2].trim());
            r.addGuest(g);
        }

        System.out.println(r);
    }
}