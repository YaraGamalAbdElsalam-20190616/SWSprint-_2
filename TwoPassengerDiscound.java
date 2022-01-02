package phase_2;

public class TwoPassengerDiscound extends Discound{
    Order order = new Order();

    public TwoPassengerDiscound(Price price) {
        super(price);
    }

    @Override
    public double getPrice(){return price.getPrice();}

    @Override
    public void setPrice(double price) {}
    
    public void addDiscound(){
        double newPrice =  price.getPrice()-(price.getPrice()*(0.05));
        setPrice(newPrice);
    }
    
}
