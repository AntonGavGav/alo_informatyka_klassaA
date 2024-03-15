package Task1;

import java.util.ArrayList;

public class Task1 {
    public BicyclicRes findBicyclic(ArrayList<String> numbers){
        int count = 0;
        String longest_one = "";
        int longest_one_length = 0;
        for(String number : numbers){
            if(isBicyclic(number)){
                count ++;
                if(longest_one_length < number.length()){
                    longest_one = number;
                    longest_one_length = number.length();
                }
            }
        }
        return new BicyclicRes(count, longest_one, longest_one_length);
    }
    public boolean isBicyclic(String number){
        int half_length = number.length()/2;
        String[] halfs = { number.substring(0, half_length), number.substring(half_length)};
        return halfs[0].equals(halfs[1]);
    }
}
