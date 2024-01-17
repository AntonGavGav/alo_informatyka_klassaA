// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,8,9,14,16,27,34,50,73,90};
        System.out.println(binarySearch(array, 14));
    }
    public static int binarySearch(int[] arr, int searched_number){
        int length = arr.length;
        int top = length-1;
        int bottom = 0;
        int mid = 0;
        while (bottom <= top){
            mid = (top+bottom)/2;
            if (arr[mid] == searched_number) {
                return mid;
            }
            else if (arr[mid] > searched_number) {
                top = mid-1;
            }
            else if (arr[mid] < searched_number) {
                bottom = mid + 1;
            }
        }
        return -1;
    }
}