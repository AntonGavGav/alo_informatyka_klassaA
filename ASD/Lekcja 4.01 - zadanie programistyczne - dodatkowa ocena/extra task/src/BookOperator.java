import java.util.ArrayList;
import java.util.HashMap;

public class BookOperator {

    public static float calculateAverage(ArrayList<Float> ratings){
        return (float) ratings.stream().mapToDouble(Float::doubleValue).sum() / ratings.size();
    }
    public static ArrayList<String> returnHighestRating(HashMap<Float, ArrayList<String>> ratingNames){
        float maxKey = Float.MIN_VALUE;
        for (float key : ratingNames.keySet()) {
            if (key > maxKey) {
                maxKey = key;
            }
        }
        return ratingNames.get(maxKey);
    }
    public static ArrayList<String> returnAuthorBooks(HashMap<String, ArrayList<String>> authorBooks, String author){
        if (!authorBooks.containsKey(author)){
            System.out.println("no such author");
            return null;
        }
        return authorBooks.get(author);
    }
    public static float calculateAverageCategory(HashMap<String, ArrayList<Float>> categoryRatings, String category){
        if (!categoryRatings.containsKey(category)){
            System.out.println("no such category");
            return 0;
        }
        ArrayList<Float> ratings = categoryRatings.get(category);
        return calculateAverage(ratings);
    }
}
