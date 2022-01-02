package phase_2;

public class AdminDiscound extends Discound{
    
    SpecificAreasStore spec = new SpecificAreasStore();

    public AdminDiscound(Price price) {
        super(price);
    }

    @Override
    public double getPrice(){
        return price.getPrice();
    }

    @Override
    public void setPrice(double pr) {
        price.setPrice(pr);
    }
    
    public void addDiscound(String distination){
        for(int i=0; i<spec.specificAreas.size(); i++){
            if(spec.displaySpecificAreas(i).equals(distination)){
                double newPrice =  price.getPrice()-(price.getPrice()*(0.1));
                setPrice(newPrice);
            }
        }
    }
    
}
