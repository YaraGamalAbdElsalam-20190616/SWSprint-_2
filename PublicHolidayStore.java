package phase_2;
import java.util.ArrayList;

public class PublicHolidayStore {

    ArrayList<String> PublicHolidays = new ArrayList<>();

    public PublicHolidayStore(){}

    public void addSPublicHolidays(){
        PublicHolidays.add("25-01");
        PublicHolidays.add("21-03");
        PublicHolidays.add("03-05");
        PublicHolidays.add("07-01");
        PublicHolidays.add("10-08");
        PublicHolidays.add("25-04");
    }        
    public String displayPublicHolidays(int i){
        return PublicHolidays.get(i);
    }
}