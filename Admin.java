package phase_2;

public class Admin {

    private static Admin admin = null;
    DriverStore storeD = new DriverStore();
    PendingDriverStore storePD = new PendingDriverStore();
    CustomerStore storeC = new CustomerStore();

    private Admin() {
    }

    public static Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public boolean verifyDriver(DriverInfo driver) {
        boolean ver = false;
        if (suspendDriver(driver) == true) {
            ver = false;
        } else {
            storeD.AddDriver(driver);
            ver = true;

        }
        return ver;
    }

    public boolean verifyPendingDriver(String name, String pass) {
        boolean verify = false;
        for (int i = 0; i < storePD.PendingDrivers.size(); i++) {
            if (name.equals(storePD.displayPendingDrivers(i).getUserName()) || pass.equals(storePD.displayPendingDrivers(i).getPassword())) {
                verify = true;
                System.out.println("You cannot log inPlease Register as a Driver again");
                break;
            }
        }
        return verify;

    }

    public boolean suspendDriver(DriverInfo driver) {
        boolean check = true;
        if (driver.getUserName() == null || driver.getPassword() == null || driver.getEmail() == null || driver.getMobileNum() == null || driver.getDrivingLicence() == null || driver.getNationalID() == null) {
            check = true;
            storePD.AddPendingDriver(driver);
        } else {
            storeD.AddDriver(driver);
            check = false;
        }
        return check;
    }

    public void suspendCustomer(CustomerInfo customer) {
       // boolean check = true;
        if (customer.getUserName() == null || customer.getPassword() == null || customer.getEmail() == null || customer.getMobileNum() == null) {
            //check = true;
            System.out.println("You cannot login");
        } else {
            storeC.AddCustomer(customer);
            System.out.println("You logged in Successfully");
            //check = false;
        }
        //return check;
    }

}
