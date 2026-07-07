import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int[] marks = new int[numberOfSubjects];

        int total = 0;

        for (int i = 0; i < numberOfSubjects; i++) {

            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            total += marks[i];
        }

        double average = (double) total / numberOfSubjects;

        char grade = calculateGrade(average);

        System.out.println(" RESULT ");
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Grade       : " + grade);

        scanner.close();
    }

    public static char calculateGrade(double average) {

        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}