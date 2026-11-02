import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nMarks of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + " marks: " + marks[i]);
        }
    }
}