import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @BeforeAll
    static void shoWBeforeAll() {
        System.out.println("TEST CASE NEXT DAY");
    }

    @Test
    @DisplayName("1/1/2018")
    void testNextDayCalculator0() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String resul = nextDayCalculator.nextDayCalculator("1/1/2018");
        String expected = "2/1/2018";
        assertEquals(expected, resul);
    }

    @Test
    @DisplayName("31/1/2018")
    void testNextDayCalculator1() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String resul = nextDayCalculator.nextDayCalculator("31/1/2018");
        String expected = "1/2/2018";
        assertEquals(expected, resul);
    }

    @Test
    @DisplayName("30/4/2018")
    void testNextDayCalculator2() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String resul = nextDayCalculator.nextDayCalculator("30/4/2018");
        String expected = "1/5/2018";
        assertEquals(expected, resul);
    }

    @Test
    @DisplayName("28/2/2018")
    void testNextDayCalculator3() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String resul = nextDayCalculator.nextDayCalculator("28/2/2018");
        String expected = "1/3/2018";
        assertEquals(expected, resul);
    }

    @Test
    @DisplayName("28/2/2018")
    void testNextDayCalculator4() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String resul = nextDayCalculator.nextDayCalculator("28/2/2018");
        String expected = "1/3/2018";
        assertEquals(expected, resul);
    }

    @Test
    @DisplayName("31/12/2018")
    void testNextDayCalculator5() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String resul = nextDayCalculator.nextDayCalculator("31/12/2018");
        String expected = "1/1/2019";
        assertEquals(expected, resul);
    }
}