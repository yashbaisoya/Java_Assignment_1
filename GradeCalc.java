import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        double avg = total / 5.0;
        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 75) {
            System.out.println("Grade: B");
        } else if (avg >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}