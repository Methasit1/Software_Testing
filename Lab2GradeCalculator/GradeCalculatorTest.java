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
}
