package Lab2GradeCalculator;


import org.junit.*;
import static org.junit.Assert.*;


public class GradeCalculatorTest {
    @Test
    public void gradeAFor80And100() {
        GradeCalculator calc = new GradeCalculator();
        assertEquals("A", calc.gradeOf(80));
        assertEquals("A", calc.gradeOf(100));
    }

    @Test
    public void lowerBoundOfEachGrade(){
        GradeCalculator calc = new GradeCalculator();
        assertEquals("A", calc.gradeOf(100));
        assertEquals("A", calc.gradeOf(80));
        assertEquals("B+", calc.gradeOf(75));
        assertEquals("B+", calc.gradeOf(79));
        assertEquals("B", calc.gradeOf(74));
        assertEquals("B", calc.gradeOf(70));
        assertEquals("C+", calc.gradeOf(65));
        assertEquals("C+", calc.gradeOf(69));
        assertEquals("C",  calc.gradeOf(60));
        assertEquals("C",  calc.gradeOf(64));
        assertEquals("D+", calc.gradeOf(55));
        assertEquals("D+", calc.gradeOf(59));
        assertEquals("D",  calc.gradeOf(50));
        assertEquals("D",  calc.gradeOf(54));
        assertEquals("F",  calc.gradeOf(49));
        assertEquals("F",  calc.gradeOf(0));
    }
}
