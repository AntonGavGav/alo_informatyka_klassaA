package Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void Number_10011001_Should_Be_Bicyclic(){
        Task1 task1 = new Task1();
        String number = "10011001";
        assertTrue(task1.isBicyclic(number));
    }
    @Test
    void Number_1001001_Should_Not_Be_Bicyclic(){
        Task1 task1 = new Task1();
        String number = "1001001";
        assertFalse(task1.isBicyclic(number));
    }
}