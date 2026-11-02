import java.util.Scanner;

interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

public class DeviceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;

            Device d = null;
            if (line.equalsIgnoreCase("Fan")) {
                d = new Fan();
            } else if (line.equalsIgnoreCase("Light")) {
                d = new Light();
            }

            if (d != null) {
                d.turnOn();
                d.turnOff();
            }
        }
    }
}