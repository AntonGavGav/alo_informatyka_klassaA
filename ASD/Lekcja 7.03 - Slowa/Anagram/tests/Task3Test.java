import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 task3 = new Task3();

    @Test
    void MASLO_Should_Be_An_Anagram_Of_SOLMA() {
        String main_word = "SOLMA";
        String checked_word = "MASLO";
        assertTrue(task3.isAnagram(main_word, checked_word));
    }

    @Test
    void SLOMA_Should_Be_An_Anagram_Of_SOLMA() {
        String main_word = "SOLMA";
        String checked_word = "SLOMA";
        assertTrue(task3.isAnagram(main_word, checked_word));
    }

    @Test
    void MASSLO_Should_Not_Be_An_Anagram_Of_SOLMA() {
        String main_word = "SOLMA";
        String checked_word = "MASSLO";
        assertFalse(task3.isAnagram(main_word, checked_word));
    }

    @Test
    void MASSLOO_Should_Not_Be_An_Anagram_Of_SSOLMA() {
        String main_word = "SSOLMA";
        String checked_word = "MASSLOO";
        assertFalse(task3.isAnagram(main_word, checked_word));
    }

    @Test
    void HELLO_Should_Not_Be_An_Anagram_Of_SOLMA() {
        String main_word = "SOLMA";
        String checked_word = "HELLO";
        assertFalse(task3.isAnagram(main_word, checked_word));
    }

    @Test
    void SOOLMA_Should_Not_Be_An_Anagram_Of_SSOLMA() {
        String main_word = "SSOLMA";
        String checked_word = "SOOLMA";
        assertFalse(task3.isAnagram(main_word, checked_word));
    }

    @Test
    void EKOKKW_Should_Not_Be_An_Anagram_Of_IDCEEX() {
        String main_word = "IDCEEX";
        String checked_word = "EKOKKW";
        assertFalse(task3.isAnagram(main_word, checked_word));
    }

}