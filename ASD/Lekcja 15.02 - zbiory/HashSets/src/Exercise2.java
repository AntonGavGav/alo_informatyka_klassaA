import java.util.Arrays;
import java.util.HashSet;

public class Exercise2 {
    public static void main(String args[]){
        int[] numbers = new int[]{1,2,3,4,2,3};
        System.out.println(numberOfUnique(numbers));
    }
    public static int numberOfUnique(int[] array){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int number: array){
            hashSet.add(number);
        }
        return hashSet.size();
    }
}
