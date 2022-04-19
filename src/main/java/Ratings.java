import java.util.HashMap;
import java.util.Map;

public class Ratings {

    // this map stores amounts for each star value
    private Map<Integer, Integer> ratingAmounts;

    public Ratings() {
        // for this implementation, I preferred to create all keys (stars) inside the constructor
        // the advantage is, there is no need to check if the key exists or not later
        ratingAmounts = new HashMap<>();
        ratingAmounts.put(0, 0); // 0 stars
        ratingAmounts.put(1, 0); // 1 stars
        ratingAmounts.put(2, 0); // 2 stars
        ratingAmounts.put(3, 0); // 3 stars
        ratingAmounts.put(4, 0); // 4 stars
        ratingAmounts.put(5, 0); // 5 stars
    }

    public void addRating(int stars) {
        if (stars < 0 || stars > 5) return;
        int currentAmount = ratingAmounts.get(stars);
        ratingAmounts.put(stars, currentAmount+1);
    }

    public int getAmountRatings() {
        int totalRatings = 0;
        for(int value : ratingAmounts.values()) {
            totalRatings += value;
        }
        return totalRatings;
    }

    public int getAmountRatings(int stars) {
        return ratingAmounts.get(stars);
    }

    public float getAverageRating() {
        int totalRatings = getAmountRatings();
        if (totalRatings == 0) return 0;

        float sumRatings = 0;
        for (Integer star : ratingAmounts.keySet()) {
            sumRatings += (star * ratingAmounts.get(star)); // star value X amount of ratings
        }

        return sumRatings / totalRatings;
    }

    @Override
    public String toString() {
        return "Ratings{" +
                "\n  getAmountRatings(0) = " + getAmountRatings(0) +
                ", \n  getAmountRatings(1) = " + getAmountRatings(1) +
                ", \n  getAmountRatings(2) = " + getAmountRatings(2) +
                ", \n  getAmountRatings(3) = " + getAmountRatings(3) +
                ", \n  getAmountRatings(4) = " + getAmountRatings(4) +
                ", \n  getAmountRatings(5) = " + getAmountRatings(5) +
                ", \n  getAmountRatings()  = " + getAmountRatings() +
                String.format(", \n  getAverageRating    = %.2f", getAverageRating()) +
                "\n}";
    }
}
