package phase_2;

public abstract class Discound extends Price{
    protected Price price;

    public Discound(Price price) {
        this.price = price;
    }

    @Override
    public double getPrice(){
        return price.getPrice();
    }

    @Override
    public void setPrice(double pr){
        price.setPrice(pr);
    }
    
}
