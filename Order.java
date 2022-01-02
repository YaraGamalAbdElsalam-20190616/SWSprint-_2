package phase_2;

public class Order {

    FavouritreAreasStore storeFA = new FavouritreAreasStore();
    AllRidesStore storeAR = new AllRidesStore();
    DriverController driverC = new DriverController();
    private String sourceArea;
    private String distinationArea;
    private int numOfPassenger;
    TwoPassengerDiscound passDiscound;

    public Order(){}

    public Order(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
        if(this.numOfPassenger == 2)
            passDiscound.addDiscound();                        
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public Order(String sourceArea, String distinationArea) {
        this.sourceArea = sourceArea;
        this.distinationArea = distinationArea;
    }

    public String getSourceArea() {
        return sourceArea;
    }

    public void setSourceArea(String sourceArea) {
        this.sourceArea = sourceArea;
    }

    public String getDistinationArea() {
        return distinationArea;
    }

    public void setDistinationArea(String distinationArea) {
        this.distinationArea = distinationArea;
    }

    public void checkRide(Order order) {
        for (int i = 0; i < storeFA.FavouritreAreas.size(); i++) {
            if (storeFA.displayFavouritreAreas(i).equals(order.sourceArea) && driverC.driverIsFree == true) {
                driverC.driverIsFree = false;
                storeAR.AddAllRides(order);
                driverC.driverIsFree = true;
            }
        }
    }
}