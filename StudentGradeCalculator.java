import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSubjects = 0;
        int totalMarks = 0;

        System.out.println("Enter the number of subjects:");
        totalSubjects = input.nextInt();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter marks for the respective subject " + i + " (out of 100):");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / totalSubjects;
        String grade = getGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
    }

    public static String getGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
