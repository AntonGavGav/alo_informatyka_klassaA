import java.util.Random;

public class Exercise2 {
    public static void main(String args[]){
        int[][] some_array = create2DArray();
        print2DTable(some_array);
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
}
