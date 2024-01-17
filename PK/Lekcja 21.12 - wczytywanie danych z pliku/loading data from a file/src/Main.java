
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        String path = "./src/data.csv";
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] formatted = line.split(",");
                students.add(new Student(formatted[0], formatted[1], formatted[2]));
            }
            //the code below is called a multi-catch
        } catch (FileNotFoundException e) {
            //needed for fileReader
            System.out.println("incorrect path");
            e.printStackTrace();
        } catch (IOException e) {
            //needed for BufferedReader
            System.out.println("file already in use");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unpredicted behaviour");
            e.printStackTrace();
        }
        for (Student student:students) {
            System.out.println(student.getPassword());
        }
    }
}
