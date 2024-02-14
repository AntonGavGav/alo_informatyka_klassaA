import java.util.HashMap;
import java.util.Stack;

public class Task2 {
    public static void main(String args[]){
        String text = "Ala ([ma]) {kota]} i psa i cos jeszcze – przykład niepoprawnego zagnieżdżenia";
        bracketsCheck(text);
    }
    public static boolean bracketsCheck(String text){
        HashMap<Character, Character> available_brackets = new HashMap<Character, Character>(){{
            put('}', '{');
            put(']', '[');
            put(')', '(');
        }};
        Stack<Character> brackets = new Stack<>();

        for (char character : text.toCharArray()) {
            if(available_brackets.containsValue(character)){
                brackets.push(character);
            }
            else if(available_brackets.containsKey(character) && brackets.pop() != available_brackets.get(character)){
                System.out.println("Incorrect");
                return false;
            }
        }
        System.out.println("Correct");
        return true;
    }
}
