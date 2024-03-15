package Task1;

public class BicyclicRes {
    private int count = 0;
    private String longest_one;
    private int longest_one_length;

    public BicyclicRes(int count, String longest_one, int longest_one_length){
        this.longest_one = longest_one;
        this.count = count;
        this.longest_one_length = longest_one_length;
    }

    public void printRes(){
        System.out.println("count: " + count);
        System.out.println("longest one: " + longest_one);
        System.out.println("longest one length: " + longest_one_length);
    }
}
