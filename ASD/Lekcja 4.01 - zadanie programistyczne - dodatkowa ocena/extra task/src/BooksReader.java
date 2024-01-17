import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class BooksReader {
    private ArrayList<Float> ratings = new ArrayList<>();
    private HashMap<Float, ArrayList<String>> ratingNames = new HashMap<>();
    private HashMap<String, ArrayList<String>> authorBooks = new HashMap<>();
    private HashMap<String,ArrayList<Float>> categoryRatings = new HashMap<>();
    public BooksReader(){

    }
    public void readFile(FileReader fileReader){

        try{
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null){
                String[] split = line.split(",");
                float rating = Float.parseFloat (split[3]);
                fillData(split[0], split[1], split[2], rating);
                line = bufferedReader.readLine();
            }
        }catch (IOException e) {
            System.out.println("File already in use");
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Unable to parse string to float");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Unpredicted behaviour");
            e.printStackTrace();
        }
    }
    private void fillData(String name, String author, String category, float rating){
        ratings.add(rating);
        addElementForKey(ratingNames, rating, name);
        addElementForKey(authorBooks, author, name);
        addElementForKey(categoryRatings, category, rating);
    }
    private <K, V> void addElementForKey(HashMap<K, ArrayList<V>> map, K key, V element){
        if (map.containsKey(key)) {
            map.get(key).add(element);
        } else {
            ArrayList<V> elements = new ArrayList<>();
            elements.add(element);
            map.put(key, elements);
        }
    }

    public ArrayList<Float> getRatings() {
        return ratings;
    }

    public HashMap<Float, ArrayList<String>> getRatingNames() {
        return ratingNames;
    }

    public HashMap<String, ArrayList<String>> getAuthorBooks() {
        return authorBooks;
    }

    public HashMap<String, ArrayList<Float>> getCategoryRatings() {
        return categoryRatings;
    }
}
