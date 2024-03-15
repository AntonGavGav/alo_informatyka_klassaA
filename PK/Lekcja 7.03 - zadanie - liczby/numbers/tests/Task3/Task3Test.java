package Task3;

import Task2.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void Decimal_1001_Should_Be_9_In_Decimal(){
        Task3 task3 = new Task3();
        int expected = 9;
        String binary_input = "1001";
        assertEquals(expected, task3.binaryToDecimal(binary_input));
    }

    @Test
    void Decimal_10_Should_Be_2_In_Decimal(){
        Task3 task3 = new Task3();
        int expected = 2;
        String binary_input = "10";
        assertEquals(expected, task3.binaryToDecimal(binary_input));
    }




    @Test
    void Binary_1110010011_Should_Be_Smaller_Than_65535() {
        Task3 task3 = new Task3();
        String number = "1110010011";
        assertFalse(task3.biggerThen65535(number));
    }
    @Test
    void Binary_10000000000000000_Should_Be_Bigger_Than_65535() {
        Task3 task3 = new Task3();
        String number = "10000000000000000";
        assertTrue(task3.biggerThen65535(number));
    }
    @Test
    void Binary_1111111111111110_Should_Be_Smaller_Than_65535() {
        Task3 task3 = new Task3();
        String number = "1111111111111110";
        assertFalse(task3.biggerThen65535(number));
    }
}