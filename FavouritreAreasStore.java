package phase_2;

import java.util.ArrayList;

public class FavouritreAreasStore {

    ArrayList<String> FavouritreAreas = new ArrayList<>();

    public FavouritreAreasStore() {
    }

    public void addFavouritreAreas(String favArea) {
        FavouritreAreas.add(favArea);

    }

    public String displayFavouritreAreas(int i) {
        return FavouritreAreas.get(i);
    }
}
