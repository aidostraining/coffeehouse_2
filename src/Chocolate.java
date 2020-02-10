
/**
 * Created by user on 04.02.2020.
 */
public class Chocolate extends Beverage {
    public String description = "Hot Chocolate";
    public String getDescription() {
        return description;
    }

    @Override
    public int price(){
        return 1200;
    }
}
