package phase_2;

public class Offer extends Price{

    private double price;

    public Offer(double price) {
        this.price = price;
    }

    @Override
    public void setPrice(double p){
        price = p;
    }
    @Override
    public double getPrice() {
        return price;
    }

}
