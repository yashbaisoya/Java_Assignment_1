import java.util.Scanner;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() { return roomNumber; }
    public String getBlock() { return block; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return roomNumber + " " + block + " " + type + ".";
    }
}

class StudentHostel {
    private String name;
    private int roll;
    private String course;
    private Room room;

    public StudentHostel(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course + "\nRoom: " + room.toString();
    }
}

public class HostelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String[] sParts = line1.split(",");
        String name = sParts[0].trim();
        int roll = Integer.parseInt(sParts[1].trim());
        String course = sParts[2].trim();

        String line2 = sc.nextLine();
        String[] rParts = line2.split(",");
        String rNo = rParts[0].trim();
        String block = rParts[1].trim();
        String type = rParts[2].trim();

        Room r = new Room(rNo, block, type);
        StudentHostel sh = new StudentHostel(name, roll, course, r);

        System.out.println(sh);
    }
}