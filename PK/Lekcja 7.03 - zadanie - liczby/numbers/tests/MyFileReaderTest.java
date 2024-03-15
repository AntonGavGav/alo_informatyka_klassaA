import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MyFileReaderTest {

    @Test
    void MyFileReader_Should_Read_hello_world() {
        String path = "./tests/MyFileReaderTest.txt";
        ArrayList<String> expected_result = new ArrayList<>();
        Collections.addAll(expected_result, "hello", "world");
        ArrayList<String> result = MyFileReader.readFile(path);
        assertEquals(expected_result, result);
    }

}