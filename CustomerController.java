package phase_2;

import java.util.Scanner;

public class CustomerController {

    public CustomerController() {
    }
    Scanner sc = new Scanner(System.in);
    Order order = new Order();
    Rating rate1 = new Rating();
    CustomerStore storeC = new CustomerStore();
    DriverController driverC = new DriverController();

    public void AddRide() {
        int numOfPassenger = sc.nextInt();
        String sourceArea = sc.next();
        String distinationArea = sc.next();
        if (driverC.driverIsFree == true) {
            order.setSourceArea(sourceArea);
            order.setDistinationArea(distinationArea);
            order.setNumOfPassenger(numOfPassenger);
            driverC.driverIsFree = false;
        }
    }

    public double Notify() {
        return rate1.getRate();
    }

    /*public void suspendCheck(CustomerInfo customer) {
     if (admin.suspendCustomer(customer) == true) {
     System.out.println("You cannot login");

     } else {
     System.out.println("You logged in Successfully");
     storeC.AddCustomer(customer);

     }
     }*/
    public boolean logIn(String name, String pass) {
        boolean flag = false;
        for (int i = 0; i < storeC.customers.size(); i++) {
            if (storeC.displayCustomer(i).getUserName().equals(name) && storeC.displayCustomer(i).getPassword().equals(pass)) {

                flag = true;
                break;
            }
        }
        return flag;
    }
}