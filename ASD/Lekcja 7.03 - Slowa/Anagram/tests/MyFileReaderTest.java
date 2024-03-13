import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MyFileReaderTest {
    @Test
    void MyFileReader_Should_Read_hello_world(){
        ArrayList<String> expected_words = new ArrayList<>();
        Collections.addAll(expected_words, "hello", "world");
        String path = "tests/fileReaderTest.txt";
        assertEquals(expected_words, MyFileReader.readFile(path));
    }
}