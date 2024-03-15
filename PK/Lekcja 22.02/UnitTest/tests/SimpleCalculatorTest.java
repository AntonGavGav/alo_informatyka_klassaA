import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator = new SimpleCalculator();
    @Test
    void TwoPlusTwo_Should_Equal_Four(){
        assertEquals(4, calculator.add(2,2));
    }
    @Test
    void SevenPlusThree_Should_Equal_Ten(){
        assertEquals(10, calculator.add(7,3));
    }
}