package phase_2;

import java.util.ArrayList;

public class RatingStore {

    ArrayList<Rating> ratings = new ArrayList<>();

    public RatingStore() {
    }

    public void AddRatings(Rating rating) {
        ratings.add(rating);
    }

    public Rating displayRatings(int i) {
        return ratings.get(i);
    }
}
