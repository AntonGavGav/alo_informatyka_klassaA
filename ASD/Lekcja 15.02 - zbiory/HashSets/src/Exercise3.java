import java.util.HashSet;

public class Exercise3 {
    public static void main(String args[]){
        int[] array = new int[]{1,2,3,4,2,3,1};
        System.out.println(findOnceAppearingWithSet(array));
        System.out.println(findOnceAppearingWithXor(array));
    }
    public static int findOnceAppearingWithXor(int[] array){
        int res = 0;
        for(int number: array){
            res ^= number;
        }
        return res;
    }
    public static int findOnceAppearingWithSet(int[] array){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int number: array){
            if(hashSet.contains(number)){
                hashSet.remove(number);
            }
            else {
                hashSet.add(number);
            }
        }
        return hashSet.iterator().next();
    }
}
