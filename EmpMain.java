import java.util.Scanner;

class Employee {
    String name;
    String id;
    double basicSalary;

    public Employee() {}

    public Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

public class EmpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] p = line.split(",");
            String type = p[0].trim();

            if (type.equalsIgnoreCase("Employee")) {
                Employee e = new Employee(p[1].trim(), p[2].trim(), Double.parseDouble(p[3].trim()));
                System.out.println(e);
            } else if (type.equalsIgnoreCase("Manager")) {
                Manager m = new Manager(p[1].trim(), p[2].trim(), Double.parseDouble(p[3].trim()), Double.parseDouble(p[4].trim()));
                System.out.println(m);
            }
        }
    }
}