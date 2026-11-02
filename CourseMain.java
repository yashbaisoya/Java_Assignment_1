import java.util.Scanner;

class Course {
    private String courseName;
    private String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() { return courseName; }
    public String getDuration() { return duration; }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    public void display() {
        System.out.println("Student: " + name + " Course: " + enrolledCourse.getCourseName() + " (" + enrolledCourse.getDuration() + ")");
    }
}

class PremiumStudent extends Student {
    private double discount;

    public PremiumStudent(String name, Course enrolledCourse, double discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public void display() {
        System.out.println("Premium Student: " + name + " Course: " + enrolledCourse.getCourseName() + " (" + enrolledCourse.getDuration() + ") Discount: " + (int)discount + "%");
    }
}

public class CourseMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line1 = sc.nextLine();
        String[] cParts = line1.split(",");
        Course c = new Course(cParts[0].trim(), cParts[1].trim());

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] p = line.split(",");

            if (p.length == 2) {
                Student s = new Student(p[0].trim(), c);
                s.display();
            } else if (p.length == 3) {
                PremiumStudent ps = new PremiumStudent(p[0].trim(), c, Double.parseDouble(p[2].trim()));
                ps.display();
            }
        }
    }
}