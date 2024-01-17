import java.util.Arrays;

public class ArrayManipulations {
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for(int i = arr1.length; i < newArr.length; i++){
            newArr[i] = arr2[i-arr1.length];
        }
        return newArr;
    }
    public static boolean isInArray(double[] arr, double num){
        for(double var: arr){
            if(num == var){
                return true;
            }
        }
        return false;
    }
    public static double getAlgebraicMean(double[] arr){
        double sum = Arrays.stream(arr).sum();
        return sum/arr.length;
    }
    public boolean isIncreasing(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            System.out.println(arr[i]);
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int findSecondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for
    }

}
