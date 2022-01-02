package phase_2;

import java.util.ArrayList;

public class AllRidesStore {

    ArrayList<Order> AllRides = new ArrayList<>();

    public AllRidesStore() {
    }

    public void AddAllRides(Order ride) {
        AllRides.add(ride);
    }

    public Order displayAllRidess(int i){
        return AllRides.get(i);
    }

}
