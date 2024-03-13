import java.util.ArrayList;
import java.util.HashMap;

public class Task3 {
    public int numberOfAnagrams(ArrayList<String> words){
        int counter = 0;
        for(String word: words){
            String[] sepWords = word.split(" ");
            if(isAnagram(sepWords[1], sepWords[0])){
                counter++;
            }
        }
        return counter;
    }
    public boolean isAnagram(String main_word, String checked_word){
        HashMap<Character, Integer> characters= new HashMap<>();
        for(char character: main_word.toCharArray()){
            if (characters.containsKey(character)){
                characters.put(character,
                        characters.get(character) + 1);
            }
            else{
                characters.put(character, 1);
            }
        }

        for(char character: checked_word.toCharArray()){
            if(!characters.containsKey(character)){
                return false;
            }
            characters.put(character,
                    characters.get(character) -1);
        }

        return areCharactersCountsZero(characters);
    }

    public boolean areCharactersCountsZero(HashMap<Character, Integer> map){
        for(int count: map.values()){
            if (count != 0){
                return false;
            }
        }
        return true;
    }

}
