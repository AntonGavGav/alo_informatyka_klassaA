import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a sequence of characters: ");
        String line = scanner.nextLine();
        System.out.println(reverse(line));
    }
    public static String reverse(String line){
        Stack<Character> characters = new Stack<>();
        for(char character : line.toCharArray()){
            characters.push(character);
        }
        String reversed = "";
        while(!characters.isEmpty()){
            reversed += characters.pop();
        }
        return reversed;
    }
}
