package phase_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notification {
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
    LocalDateTime now=LocalDateTime.now();
    AllRidesStore storeAR = new AllRidesStore();
    DriverInfo driver = new DriverInfo();
    CustomerInfo customer = new CustomerInfo();
    CustomerController customerC =new CustomerController();
    DriverController driverC = new DriverController();
    public Notification() {
    }

    public void notifyRide() {
        for (int i = 0; i < storeAR.AllRides.size(); i++) {
            storeAR.displayAllRidess(i);
        }
    }

    public void updateDriver() {
        System.out.println("your rate is: " + customerC.Notify());
    }

    public void PutPrice()
    {
        System.out.println("Event Name: Put price\nEvent Date and Time:"+dtf.format(now)+"\nCaptain Name: "+driver.getUserName()+"\nPrice: "+driverC.Notify());
    }
    public void UserAccepts(String accept)
    {
        if(accept.equalsIgnoreCase("yes"))
            {
                System.out.println("Event Name: Acceptness\nEvent Date and Time:"+dtf.format(now)+"\nUser Name: "+customer.getUserName());
            }
        
    }
    public void ArriveLocation(String answer)
    {
        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("Event Name: Arrived Location\nEvent Date and Time:"+dtf.format(now)+"\nCaptain Name: "+driver.getUserName()+"\nUser Name: "+customer.getUserName());
        }
        
    }
    public void ArriveDestination(String des)
    {
        if(des.equalsIgnoreCase("yes")){
            System.out.println("Event Name: Arrived Destination\nEvent Date and Time:"+dtf.format(now)+"\nCaptain Name: "+driver.getUserName()+"\nUser Name: "+customer.getUserName());
        }   

    }
}