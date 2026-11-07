
package nandana_aiml.mavenn_github_project;

import java.util.Scanner;

public class GradeCalculator {

    public static char calculateGrade(int mark) {

        if (mark >= 80) {
            return 'A';
        } 
        else if (mark >= 60) {
            return 'B';
        } 
        else {
            return 'C';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student mark: ");
        int mark = sc.nextInt();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        } 
        else {
            char grade = calculateGrade(mark);

            System.out.println("Student Mark: " + mark);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
