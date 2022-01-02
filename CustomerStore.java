package phase_2;

import java.util.ArrayList;

public class CustomerStore {

    public ArrayList<CustomerInfo> customers = new ArrayList<>();

    public CustomerStore() {
    }

    public void AddCustomer(CustomerInfo customer) {
        customers.add(customer);
    }

    public CustomerInfo displayCustomer(int i) {
        return customers.get(i);
    }

}
