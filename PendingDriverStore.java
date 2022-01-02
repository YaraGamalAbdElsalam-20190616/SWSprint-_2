package phase_2;

import java.util.ArrayList;

public class PendingDriverStore {

    ArrayList<DriverInfo> PendingDrivers = new ArrayList<>();

    public PendingDriverStore() {
    }

    public void AddPendingDriver(DriverInfo pendingDriver) {
        PendingDrivers.add(pendingDriver);
    }

    public DriverInfo displayPendingDrivers(int i) {

        return PendingDrivers.get(i);
    }

}
