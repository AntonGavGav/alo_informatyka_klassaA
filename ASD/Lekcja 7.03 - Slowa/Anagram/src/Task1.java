import java.util.ArrayList;

public class Task1 {
    public int numberOfWordsEndingWithA(ArrayList<String> words){
        int counter = 0;
        for(String word: words){
            for(String sepWord: word.split(" ")){
                if(doesEndWithA(sepWord)){
                    counter ++;
                }
            }
        }
        return counter;
    }
    public boolean doesEndWithA(String word){
        return word.charAt(word.length()-1) == 'A';
    }
}
