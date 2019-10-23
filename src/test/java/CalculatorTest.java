import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions;


class CalculatorTest {

    @Test
    void test1() {
        Calculator tester = new Calculator();
        float expected = tester.calc(15, 16, "+");
        float actual = 31;
        assertEquals(expected, actual);
    }
    @Test
    void test2() {
        Calculator tester = new Calculator();
        float expected = tester.calc(15, -16, "+");
        float actual = -1;
        assertEquals(expected, actual);
    }
    @Test
    void test3() {
        Calculator tester = new Calculator();
        float expected = tester.calc(15, -14, "+");
        float actual = (float) 1.00;
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        Calculator tester = new Calculator();
        float expected = tester.calc(-15, -16, "+");
        float actual = -31;
        assertEquals(expected, actual);
    }
}