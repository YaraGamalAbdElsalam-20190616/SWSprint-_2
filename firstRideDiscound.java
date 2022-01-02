package phase_2;

public class firstRideDiscound extends Discound{

    public firstRideDiscound(Price price) {
        super(price);
    }

    @Override
    public double getPrice(){return price.getPrice();}

    @Override
    public void setPrice(double pr){price.setPrice(pr);}
    
    public void addDiscound(){
        double newPrice =  price.getPrice()-(price.getPrice()*(0.1));
        setPrice(newPrice);
    }    
}
