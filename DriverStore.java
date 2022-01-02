package phase_2;

import java.util.ArrayList;

public class DriverStore {

    ArrayList<DriverInfo> drivers = new ArrayList<>();

    public DriverStore() {
    }

    public void AddDriver(DriverInfo driver) {
        drivers.add(driver);
    }

    public DriverInfo displayDrivers(int i) {

        return drivers.get(i);
    }
}
