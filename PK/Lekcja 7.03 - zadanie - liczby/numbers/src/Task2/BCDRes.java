package Task2;

public class BCDRes {
    private int count;
    private int smallest_length;

    public BCDRes(int count, int smallest_length){
        this.count = count;
        this.smallest_length = smallest_length;
    }

    public void printRes(){
        System.out.println("incorrect BCDs count: " + count);
        System.out.println("smallest length of incorrect number: " + smallest_length);
    }
}
