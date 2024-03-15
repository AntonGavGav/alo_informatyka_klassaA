package Task3;

import java.util.ArrayList;

public class Task3 {
    public MaxDecimalRes getMaxDecimal(ArrayList<String> numbers){
        int max_decimal_representation = Integer.MIN_VALUE;
        String max_binary_representation = "";
        for(String number: numbers){
            if(!biggerThen65535(number)){
                int decimal = binaryToDecimal(number);
                if(decimal > max_decimal_representation){
                    max_decimal_representation = decimal;
                    max_binary_representation = number;
                }
            }
        }
        return new MaxDecimalRes(max_decimal_representation, max_binary_representation);
    }
    public int binaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }
    public boolean biggerThen65535(String number){
        return number.length() > 16;
    }

}
