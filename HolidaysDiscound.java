package phase_2;
import java.time.LocalDate;

public class HolidaysDiscound extends Discound{
    
    PublicHolidayStore pubHolidays = new PublicHolidayStore();

    public HolidaysDiscound(Price price) {
        super(price);
    }

    @Override
    public double getPrice() {return price.getPrice();}//not sure

    @Override
    public void setPrice(double pr){
        price.setPrice(pr);
    }
    
    public void addDiscound(){
        LocalDate date = java.time.LocalDate.now();
        for(int i=0; i<pubHolidays.PublicHolidays.size(); i++){
            if(pubHolidays.PublicHolidays.get(i).equals(date)){
                double newPrice =  price.getPrice()-(price.getPrice()*(0.05));
                setPrice(newPrice);
            }
        }
    }
    
}