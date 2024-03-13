import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileReader {
    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> words = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while((line = reader.readLine()) != null){
                words.add(line);
            }
            reader.close();
            return words;

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("file is used by another program");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Unknown exception");
            e.printStackTrace();
        }
        return null;
    }
}
