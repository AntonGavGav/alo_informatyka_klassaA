import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Exercise1 {
    public static void main(String args[]){
        int[][] some_array = generateRandomTable(100, 10);
//        int[][] some_array = {
//        {5,90,2,2,2,2,2,2,19}, {65,3,2,2,2,2,2,2,12}, {21,61,2,2,2,2,2,2,8}, {2,11,2,2,2,2,2,2,6}
//        };
        print2DTable(some_array);
        System.out.println(elementsAverage(some_array, 8080));
    }
    public static void print2DTable(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] generateRandomTable(int rows, int columns){
        Random random = new Random();
        int[][] array = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }
    public static float elementsAverage(int[][] table, int number){
        HashSet<Integer> unique_numbers = splitNumberTODigits(number);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < table.length; i+=2){
            for(int j: unique_numbers){
                sum += table[i][j];
                count++;
            }
        }
        return (float) sum /count;
    }
    public static HashSet<Integer> splitNumberTODigits(int number){
        HashSet<Integer> unique_numbers = new HashSet<>();
        while (number > 0) {
            unique_numbers.add(number % 10);
            number /= 10;
        }
        return unique_numbers;
    }
}
