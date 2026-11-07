package nandana_aiml.mavenn_github_project;

public class GradeCalculator {

    public static int calculateTotal(int m1) {
        return m1 ;
    }

    public static double calculateAverage(int m1) {
        return calculateTotal(m1);
    }

    public static char calculateGrade(double average) {

        if (average >= 80) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public static void main(String[] args) {

        int m1 = 75;

        int total = calculateTotal(m1);
        double average = calculateAverage(m1);
        char grade = calculateGrade(average);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
