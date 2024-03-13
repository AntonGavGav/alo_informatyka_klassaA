import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void Word_BANANA_Should_End_With_A() {
        String word = "BANANA";
        Task1 task1 = new Task1();
        assertTrue(task1.doesEndWithA(word));
    }
    @Test
    void Word_HELLO_ShouldNot_End_With_A(){
        String word = "HELLO";
        Task1 task1 = new Task1();
        assertFalse(task1.doesEndWithA(word));
    }
}