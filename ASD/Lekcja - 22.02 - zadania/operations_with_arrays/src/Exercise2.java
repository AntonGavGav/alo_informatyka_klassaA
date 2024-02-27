import java.util.Random;

public class Exercise2 {
    public static void main(String args[]){
        int[][] some_array = create2DArray();
        print2DTable(some_array);
        TwoMaxResult two_max_values_res = find2MaxValues(some_array);
        System.out.println(two_max_values_res.getMax() + " " + two_max_values_res.getMax2());
        System.out.println(ratioEvenToOdd(some_array));
        System.out.println(countCellsLessThanIndexProduct(some_array));
    }
    public static void print2DTable(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("%4d",matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] create2DArray(){
        Random random = new Random();
        int size = random.nextInt(10,20);
        int[][] array = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j){
                    array[i][j] = random.nextBoolean() ? 1 : -1;
                }
                else{
                    array[i][j] = random.nextInt(-100, 100);
                }
            }
        }
        return array;
    }
    public static TwoMaxResult find2MaxValues(int[][] array){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] > max){
                    max2 = max;
                    max = array[i][j];
                } else if (array[i][j] > max2) {
                    max2 = array[i][j];
                }
            }
        }
        return new TwoMaxResult(max, max2);
    }
    public static float ratioEvenToOdd(int[][] array){
        return (float) sumOfEvenRows(array) / sumOfOddColumns(array);
    }
    public static int sumOfOddColumns(int[][] array){
        int sum = 0;
        for(int j = 1; j < array[0].length; j+=2){
            for(int i = 0; i < array.length; i++){
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static int sumOfEvenRows(int[][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i+=2){
            for(int j = 0; j < array[0].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static int countCellsLessThanIndexProduct(int[][] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                int number = array[i][j];
                if(number < j*i){
                    count++;
                }
            }
        }
        return count;
    }
}
