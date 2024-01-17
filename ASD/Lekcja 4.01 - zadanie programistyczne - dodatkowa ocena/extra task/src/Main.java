import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "./src/books.csv";
        BooksReader booksReader = new BooksReader();
        try {
            FileReader fileReader = new FileReader(path);
            booksReader.readFile(fileReader);
            System.out.println("somne");
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

        //for print author books, don't forget to update the author
        //same for average category
        Scanner scanner = new Scanner(System.in);
        inputSystem(scanner, booksReader);
    }
    public static void inputSystem(Scanner scanner, BooksReader booksReader){
        while(true){
            System.out.print("What function you want to run?: ");
            String function_name = scanner.nextLine();
            switch (function_name){
                case "stop":
                case "break":
                case "shutdown":
                    return;
                case "calc average":
                    System.out.println(BookOperator.
                            calculateAverage(booksReader.getRatings()));
                    break;
                case "highest rating":
                    System.out.println(BookOperator.
                            returnHighestRating(booksReader.getRatingNames()));
                    break;
                case "author books":
                    System.out.print("Name of the author: ");
                    String author = scanner.nextLine();
                    System.out.println(BookOperator.
                            returnAuthorBooks(booksReader.getAuthorBooks(), author));
                    break;
                case "category average":
                    System.out.print("Which category?: ");
                    String category = scanner.nextLine();
                    System.out.println(BookOperator.
                            calculateAverageCategory(booksReader.getCategoryRatings(), category));
                    break;
                case "help":
                    printHelp();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
    public static void printHelp(){
        System.out.println("--------");
        System.out.println("stop, break, shutdown - stop the program");
        System.out.println("calc average - Wyliczenie średniej wszystkich książek");
        System.out.println("highest rating - Znalezienie książki o najwyższej średniej (lub książek)");
        System.out.println("author books - Znalezienie wszystkich książek wybranego autora ");
        System.out.println("category average - Obliczenie średniej wszystkich książek z wybranej kategorii");
        System.out.println("--------");
    }


}