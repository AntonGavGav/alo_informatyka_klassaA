import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileReader {
    public static ArrayList<String> readFile(String file){
        ArrayList<String> words = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while((line = reader.readLine()) != null){
                words.add(line);
            }
            reader.close();
            return words;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File may be used by another program");
            e.printStackTrace();
        }
        return null;
    }
}
