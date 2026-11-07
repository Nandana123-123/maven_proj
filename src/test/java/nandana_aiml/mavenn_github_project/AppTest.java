
package nandana_aiml.mavenn_github_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    void testGradeA() {
        assertEquals('A', GradeCalculator.calculateGrade(90));
    }

    @Test
    void testGradeB() {
        assertEquals('B', GradeCalculator.calculateGrade(75));
    }

    @Test
    void testGradeC() {
        assertEquals('C', GradeCalculator.calculateGrade(40));
    }

    @Test
    void testMinimumGradeA() {
        assertEquals('A', GradeCalculator.calculateGrade(80));
    }

    @Test
    void testMinimumGradeB() {
        assertEquals('B', GradeCalculator.calculateGrade(60));
    }
}
