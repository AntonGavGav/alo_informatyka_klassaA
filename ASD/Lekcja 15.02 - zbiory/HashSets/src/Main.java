public class Main {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();
        mySet.add(12);
        mySet.add(12);
        mySet.add(11);
        System.out.println(mySet.length());
    }
}