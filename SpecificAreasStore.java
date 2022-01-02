package phase_2;
import java.util.ArrayList;

public class SpecificAreasStore {
    public ArrayList<String> specificAreas = new ArrayList<>();

    public SpecificAreasStore() {
    }

    public void addSpecificAreas(String specArea) {
        specificAreas.add(specArea);
    }

    public String displaySpecificAreas(int i) {
        return specificAreas.get(i);
    }
    
}