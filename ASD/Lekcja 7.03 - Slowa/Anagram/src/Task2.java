import java.util.ArrayList;

public class Task2 {
    public int numberOfWordsContainingFirstWord(ArrayList<String> words) {
        int counter = 0;
        for(String word: words){
            String[] sepWords = word.split(" ");
            if(sepWords[1].contains(sepWords[0])){
                counter++;
            };
        }
        return counter;
    }
}
