import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Doctor extends Person {
    protected String spec;

    public Doctor(String name, int age, String spec) {
        super(name, age);
        this.spec = spec;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecialization: " + spec;
    }
}

class Surgeon extends Doctor {
    private String surgeryType;

    public Surgeon(String name, int age, String spec, String surgeryType) {
        super(name, age, spec);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSurgery Type: " + surgeryType;
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] p = line.split(",");

        Surgeon s = new Surgeon(p[0].trim(), Integer.parseInt(p[1].trim()), p[2].trim(), p[3].trim());
        System.out.println(s);
    }
}