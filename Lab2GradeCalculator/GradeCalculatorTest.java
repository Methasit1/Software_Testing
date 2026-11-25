package Lab2GradeCalculator;


import org.junit.*;
import static org.junit.Assert.*;

public class GradeCalculatorTest {
    private GradeCalculator calc;

    @Before
    public void setup() {
        calc = new GradeCalculator();
    }

    @Test
    public void gradeAFor80And100() {
        assertEquals("A", calc.gradeOf(80));
        assertEquals("A", calc.gradeOf(100));
    }

    @Test
    public void lowerBoundOfEachGrade() {
        assertEquals("A",  calc.gradeOf(80));
        assertEquals("B+", calc.gradeOf(75));
        assertEquals("B+", calc.gradeOf(79));
        assertEquals("B",  calc.gradeOf(70));
        assertEquals("C+", calc.gradeOf(65));
        assertEquals("C",  calc.gradeOf(60));
        assertEquals("D+", calc.gradeOf(55));
        assertEquals("D",  calc.gradeOf(50));
        assertEquals("F",  calc.gradeOf(49));
        assertEquals("F",  calc.gradeOf(0));
    }

    @Test
    public void scoreOutOfRangeThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.gradeOf(-1));
        assertThrows(IllegalArgumentException.class, () -> calc.gradeOf(101));
    }
}