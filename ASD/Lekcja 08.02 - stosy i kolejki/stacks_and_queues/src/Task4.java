import java.util.Scanner;
import java.util.Stack;

public class Task4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your equation: ");
        String line =  scanner.nextLine();
        String[] notation = line.split(" ");
        calculator(notation);
    }
    public static float calculator(String[] notation){
        Stack<Float> numbers = new Stack<>();
        for(String character : notation){
            try{
                float number = Float.parseFloat(character);
                numbers.push(number);
            } catch (NumberFormatException e){ //occurs when an attempt is made to convert a string with an incorrect format to a numeric value
                float a = numbers.pop();
                float b = numbers.pop();
                String operation = character;
                System.out.println(a + " " + operation + " " + b);
                numbers.push(performOperation(operation, b, a));
            } catch (Exception e){
                System.out.println("Something went wrong while converting");
                System.out.println(e.getStackTrace());
            }
        }
        float result = numbers.pop();
        System.out.println("-----------");
        System.out.println("The result is: " + result);
        return result;
    }
    public static float performOperation(String operator, float a, float b){
        float result = 0;
        switch (operator){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        return result;
    }
}
