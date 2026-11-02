import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Professor {
    private String name;
    private String empId;
    private String spec;

    public Professor() {}

    public Professor(String name, String empId, String spec) {
        this.name = name;
        this.empId = empId;
        this.spec = spec;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmpId() { return empId; }
    public void setEmpId(String empId) { this.empId = empId; }
    public String getSpec() { return spec; }
    public void setSpec(String spec) { this.spec = spec; }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + empId + ", Specialization: " + spec;
    }
}

class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    public Department() {
        this.professors = new ArrayList<>();
    }

    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new ArrayList<>();
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }
    public String getHodName() { return hodName; }
    public void setHodName(String hodName) { this.hodName = hodName; }
    public List<Professor> getProfessors() { return professors; }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    @Override
    public String toString() {
        String res = "Department: " + deptName + "\nHOD: " + hodName + "\nProfessors:\n";
        for (Professor p : professors) {
            res += p.toString() + "\n";
        }
        return res.trim();
    }
}

public class UnivDeptMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] parts1 = line1.split(",");
        String dName = parts1[0].trim();
        String hName = parts1[1].trim();

        Department d = new Department(dName, hName);

        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] p = line.split(",");
            Professor prof = new Professor(p[0].trim(), p[1].trim(), p[2].trim());
            d.addProfessor(prof);
        }

        System.out.println(d);
    }
}