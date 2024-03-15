package Task3;

public class MaxDecimalRes {
    private int decimal_representation;
    private String binary_representation;

    public MaxDecimalRes(int decimal_representation, String binary_representation){
        this.decimal_representation = decimal_representation;
        this.binary_representation = binary_representation;
    }

    public void printRes(){
        System.out.println("decimal representation: " + decimal_representation);
        System.out.println("binary representation: " + binary_representation);
    }
}
