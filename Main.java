package phase_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Admin admin = Admin.getAdmin();
        DriverStore storeD = new DriverStore();
        FavouritreAreasStore storeFA = new FavouritreAreasStore();
        RatingStore storeR = new RatingStore();
        CustomerInfo customer = new CustomerInfo();
        DriverInfo driver = new DriverInfo();
        Order order = new Order();
        Offer offer = new Offer();
        Rating rating = new Rating();
        Notification notification = new Notification();
        CustomerController customerC = new CustomerController();
        DriverController driverC = new DriverController();
        SpecificAreasStore storeSA = new SpecificAreasStore(); 
        Scanner sc = new Scanner(System.in);
        
        String sp;
        for(int i=0; i<storeSA.specificAreas.size(); i++){
            sp = sc.nextLine();
            if (sp.equals(".")){
                break;
            }
            admin.setSpecificArea(sp);
        }
        
        while (true) {
            System.out.println("Please Choose \n1-Register\n2-Login");
            int choose = sc.nextInt();
            if (choose == 1)//Register
            {
                System.out.println("Regiser as\n1-Driver\n2-Customer");
                int k = sc.nextInt();
                if (k == 1)//Register as a driver
                {
                    System.out.println("Please enter a complete information" + "\nUser Name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Password: ");
                    String pass = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    System.out.println("Mobile number: ");
                    String mob = sc.nextLine();
                    System.out.println("Driving License: ");
                    String drivLic = sc.nextLine();
                    System.out.println("National ID: ");
                    String nationalId = sc.nextLine();
                    driver = new DriverInfo(name, pass, email, mob, drivLic, nationalId);
                    admin.suspendDriver(driver);
                    if (admin.verifyDriver(driver) == true) {
                        storeD.AddDriver(driver);
                        System.out.println("Welcome To Our App");
                        System.out.println("Please Enter Your Fav Areas");
                        int i = 0;
                        String favArea = sc.nextLine();
                        while (!favArea.equals(".")) {
                            storeFA.addFavouritreAreas(favArea);
                            favArea = sc.nextLine();
                            i++;
                        }

                    } else {
                        System.out.println("yor are now in the pending drivers");
                    }
                } else if (k == 2)//Register as a customer
                {
                    System.out.println("Please enter a complete information" + "\nUser Name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Password: ");
                    String pass = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    System.out.println("Mobile number: ");
                    String mob = sc.nextLine();
                    System.out.println("BirthDate: ");
                    String birth = sc.nextLine();
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
                    LocalDate date = LocalDate.parse(birth, dateFormat);
                    customer = new CustomerInfo(name, pass, email, mob, date);
                    admin.suspendCustomer(customer);
                } else {
                    System.out.println("Unvalid Choose");
                }
            } else if (choose == 2)//Login
            {
                System.out.println("Login as\n1-Driver\n2-Customer");
                int i = sc.nextInt();
                if (i == 1)//Login as a driver 
                {
                    System.out.println("Please Enter Your" + "\nUser Name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Password: ");
                    String pass = sc.nextLine();
                    if (driverC.logIn(name, pass) == true) {
                        System.out.println("You loged in successfully");
                        System.out.println("Check if you have an order");
                        notification.notifyRide();
                        System.out.println("Set A price to your tripe");
                        double price = sc.nextDouble();
                        offer.setPrice(price);
                        driverC.Notify();
                        notification.updateDriver();
                        System.out.println("Do you arrived to User Location?");
                        String answer=sc.nextLine();
                        notification.ArriveLocation(answer);
                        System.out.println("Do you arrived to User Destination?");
                        String des=sc.nextLine();
                        notification.ArriveDestination(des);
                        
                    } else {
                        System.out.println("Check your user name and your pass");
                    }
                } else if (i == 2)//Login as a customer 
                {
                    System.out.println("Please Enter Your" + "\nUser Name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Password: ");
                    String pass = sc.nextLine();
                    if (customerC.logIn(name, pass) == true) {
                        System.out.println("You loged in successfully");
                        System.out.println("Do you want to order now?");
                        String or = sc.nextLine();
                        if (or.equals("ok")) {
                            System.out.println("Please Enter your\nSource Area");//System.out.println();
                            String source = sc.nextLine();
                            System.out.println("Destination Area");
                            String distenation = sc.nextLine();
                            order = new Order(source, distenation);
                            order.checkRide(order);
                            notification.PutPrice();
                            System.out.println("Do u accept the price? Yes or No");
                            String accept=sc.nextLine();
                            notification.UserAccepts(accept);
                            System.out.println("Please Rate your driver");
                            double rate = sc.nextDouble();
                            rating.setRate(rate);
                            storeR.AddRatings(rating);
                        }
                    } else //Enter invalid information to login
                    {
                        System.out.println("Check your user name and your pass");
                    }
                } 
            }
        }
    }
}