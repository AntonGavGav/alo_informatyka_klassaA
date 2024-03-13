import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = MyFileReader.readFile("slowa.txt");

        Task1 task1 = new Task1();
        System.out.println(task1.numberOfWordsEndingWithA(words));

        Task2 task2 = new Task2();
        System.out.println(task2.numberOfWordsContainingFirstWord(words));

        Task3 task3 = new Task3();
        System.out.println(task3.numberOfAnagrams(words));
    }


}

