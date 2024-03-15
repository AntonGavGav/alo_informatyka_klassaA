package Task2;

import java.util.ArrayList;

public class Task2 {
    public BCDRes findIncorrectBCDs(ArrayList<String> numbers) throws Exception {
        int count = 0;
        int smallest_length = Integer.MAX_VALUE;
        for(String number: numbers){
            if(!isNumberBCDCorrect(number)){
                if(number.length() < smallest_length){
                    smallest_length = number.length();
                }
                count++;
            }
        }
        return new BCDRes(count, smallest_length);
    }
    public boolean isNumberBCDCorrect(String number) throws Exception {
        ArrayList<String> parts_of_four= stringDivideToParts(number, 4);
        for(String part: parts_of_four){
            if(binaryToDecimal(part) > 9){
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> stringDivideToParts(String line, int part_length) throws Exception {
        if(line.length() %part_length != 0){
            throw new IllegalArgumentException("Can't split strings evenly with line length of: "
                    + line.length() +
                    ", and part_length of: " + part_length);
        }
        String subString = "";
        ArrayList<String> split_strings = new ArrayList<>();
        for (int i = 0; i < line.length(); i+=part_length) {
            subString = line.substring(i, i+part_length);
            split_strings.add(subString);
        }
        return split_strings;
    }
    public int binaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }
}
