import java.lang.reflect.Array;
import java.util.Arrays;

//regex101.com
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(task1(5));
        System.out.println("-------");
        System.out.println("Task 2:");
        System.out.println(task2(5));
        System.out.println("-------");
        System.out.println("Task 3:");
        System.out.println(task3(2, 3));
        System.out.println("-------");
        System.out.println("Task 4:");
        System.out.println(task4(345));
        System.out.println("-------");
        System.out.println("Task 5:");
        String text = "ala ma kota i psa i ala alla alaa ala kota pies ala";
        String[] words = text.split("\\W+");
        System.out.println(task5(words, "ala", 0, 0));
        System.out.println("-------");
        System.out.println("Task 6:");
        System.out.println(Arrays.toString(task6(new int[]{1, 2, 3, 4,5,7}, 0)));
    }
    public static int task1(int n){
        if(n==0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return task1(n-1) + task1(n-2);
    }
    public static int task2(int num){
        if(num==1){
            return 1;
        }
        return task2(num-1) + num;
    }
    public static int task3(int n, int power){
        if(power == 1){
            return n;
        }
        return task3(n, power - 1) * n;
    }

//    public static int task4(int number, int count){
//        //System.out.println((345%100)/100); <-> to get 3
//        count++;
//        int extra = count-1 == 0 ? 1 : (int) Math.pow(10, (count - 1));
//        //System.out.println("n = (" + number + "%(" + (int) Math.pow(10, (count)) + "))/" + extra);
//        int n = ( (number)%(int) Math.pow(10, (count)) )/ extra;
//        if(number / (int) Math.pow(10, (count)) < 1){
//            return n;
//        }
//        return n + task4(number, count);
//    }

    public static int task4(int number){
        if (number == 0) {
            return 0;
        }
        return number % 10 + task4(number / 10);

    }

    public static int task5(String[] words, String word, int i, int counter){
        if(i >= words.length){
            return counter;
        }
        if(word.equals(words[i])){
            counter++;
        }
        i++;
        return task5(words, word, i, counter);
    }

//    public static int task5(String text, String word){
//        int firstIdx = text.indexOf(word);
//        if (firstIdx == -1) {
//            return 0;
//        }
//        return 1 + task5(text.substring(firstIdx + word.length()), word);
//    }

    public static int[] task6(int[] array, int i){
        //System.out.println(i + " " + array.length/2);
        int last_index = array.length-i-1;
        if(i >= array.length/2-1){
            int temp = array[last_index];
            array[last_index] = array[i];
            array[i] = temp;
            return array;
        }
        //System.out.println(array[i] + " " + array[array.length-i-1]);
        int[] new_arr = task6(array, i+1);
        int temp = new_arr[last_index];
        new_arr[last_index] = new_arr[i];
        new_arr[i] = temp;
        return new_arr;
    }



}