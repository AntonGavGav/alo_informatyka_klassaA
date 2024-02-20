import java.util.HashSet;

public class Exercise4 {
    public static void main(String args[]){
        HashSet<Integer> a = new HashSet<Integer>(){{add(1);add(3);add(5);add(7);}};
        HashSet<Integer> b = new HashSet<Integer>(){{add(2);add(4);add(6);add(7);}};
        System.out.println(containSimilarElement(a, b));
    }
    public static boolean containSimilarElement(HashSet<Integer> a, HashSet<Integer> b){
        for(Integer number: a){
            if(b.contains(number)){
                return true;
            }
        }
        return false;
    }
}
