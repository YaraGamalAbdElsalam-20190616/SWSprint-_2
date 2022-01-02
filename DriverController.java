package phase_2;

import java.util.Scanner;

public class DriverController {
    private double balance;
    DriverStore storeD = new DriverStore();
    Scanner sc = new Scanner(System.in);
    Offer offer1;
    FavouritreAreasStore storeFA = new FavouritreAreasStore();
    boolean driverIsFree ;
    public DriverController() {
    driverIsFree = true ;
    }
     public double getBalance() {
        return balance;
    }
    double actualBalance=offer1.getPrice();
    public void setBalance() {
        balance = actualBalance;
    }

    public double Notify() {
        return offer1.getPrice();
    }

    public boolean logIn(String name, String pass) {
        boolean flag = false;
        for (int i = 0; i < storeD.drivers.size(); i++) {
            if (storeD.displayDrivers(i).getUserName().equals(name) && storeD.displayDrivers(i).getPassword().equals(pass)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public void setSFavouritreAreas(String favArea){
        storeFA.addFavouritreAreas(favArea);
    }
}