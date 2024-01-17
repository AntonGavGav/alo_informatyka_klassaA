import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] some_array = generateRandomArray(1, 10, 20);
        bubbleSort(some_array);
        betterBubbleSort(some_array);
        selectionSort(some_array);

        int[] another_array = new int[]{1, 0, 1, 2, 2, 0, 3, 1, 0, 3, 2, 0, 1, 3, 2, 1, 2, 0 ,1, 2, 3,3,3,0,1,1,0,2, 3, 0};
        mySort(another_array, 4);
    }

    private static int[] generateRandomArray(int lower_bound, int upper_bound, int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (upper_bound - lower_bound)) + lower_bound;
        }
        return array;
    }

    //as suggested in the document
    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    //second loop going to take less time and if no changes are made we will exit the sort
    private static int[] betterBubbleSort(int[] array) {
        int changes_checker = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                    changes_checker += 1;
                }
            }
            if (changes_checker == 0) {
                break;
            }
            changes_checker = 0;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp_min = i;
            for (int j = i; j < array.length; j++) {
                temp_min = array[temp_min] > array[j] ? j : temp_min;
            }
            int temp = array[i];
            array[i] = array[temp_min];
            array[temp_min] = temp;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    //For task nr3 we could use something like counting sort, but I've created this. The complexity is O(n) if the limit is set to 4:
    private static int[] mySort(int[] array, int limit) {
        int start = 0;
        for (int i = 0; i < limit-1; i++) {
            for (int j = start; j < array.length; j++) {
                if(array[j] == i){
                    int temp = array[start];
                    array[start] = array[j];
                    array[j] = temp;
                    start++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}