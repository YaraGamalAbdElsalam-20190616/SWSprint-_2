package phase_2;

import java.time.LocalDate;

public class birthDayDiscound extends Discound{
    CustomerStore customer = new CustomerStore();

    public birthDayDiscound(Price price) {
        super(price);
    }

    @Override
    public double getPrice(){return price.getPrice();}

    @Override
    public void setPrice(double pr){
        price.setPrice(pr);
    }
    
    public void addDiscound(){
        LocalDate date = java.time.LocalDate.now();
        for(int i=0; i<customer.customers.size(); i++){
            if(customer.customers.get(i).getBirthDate().equals(date)){
                double newPrice =  price.getPrice()-(price.getPrice()*(0.1));
                setPrice(newPrice);
            }
        }
    }
}
