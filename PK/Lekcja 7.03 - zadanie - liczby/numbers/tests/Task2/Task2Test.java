package Task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void Decimal_1001_Should_Be_9_In_Decimal(){
        Task2 task2 = new Task2();
        int expected = 9;
        String binary_input = "1001";
        assertEquals(expected, task2.binaryToDecimal(binary_input));
    }

    @Test
    void Decimal_10_Should_Be_2_In_Decimal(){
        Task2 task2 = new Task2();
        int expected = 2;
        String binary_input = "10";
        assertEquals(expected, task2.binaryToDecimal(binary_input));
    }



    @Test
    void String_helloworld_Divided_To_Substrings_With_Length_5_Should_Return_hello_world() throws Exception {
        String input = "helloworld";
        int part_length = 5;

        Task2 task2 = new Task2();
        ArrayList<String> expected_result = new ArrayList<>();
        Collections.addAll(expected_result, "hello", "world");
        assertEquals(expected_result, task2.stringDivideToParts(input, part_length));
    }

    @Test
    void String_123456_Divided_To_Substrings_With_Length_3_Should_Return_123_456() throws Exception {
        String input = "123456";
        int part_length = 3;

        Task2 task2 = new Task2();
        ArrayList<String> expected_result = new ArrayList<>();
        Collections.addAll(expected_result, "123", "456");
        assertEquals(expected_result, task2.stringDivideToParts(input, part_length));
    }

    @Test
    void String_123456_Divided_To_Substrings_With_Length_4_Should_Return_Exception() throws Exception {
        String input = "123456";
        int part_length = 4;

        Task2 task2 = new Task2();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    task2.stringDivideToParts(input,part_length);
                });
    }



    @Test
    void Binary_10010111_Should_Return_True() throws Exception {
        String binary = "10010111";
        Task2 task2 = new Task2();
        assertTrue(task2.isNumberBCDCorrect(binary));
    }
    @Test
    void Binary_11010000_Should_Return_False() throws Exception {
        String binary = "11010000";
        Task2 task2 = new Task2();
        assertFalse(task2.isNumberBCDCorrect(binary));
    }
    @Test
    void Binary_1110_Should_Return_False() throws Exception {
        String binary = "1110";
        Task2 task2 = new Task2();
        assertFalse(task2.isNumberBCDCorrect(binary));
    }
}