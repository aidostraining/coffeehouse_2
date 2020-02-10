
/**
 * Created by user on 04.02.2020.
 */
public class Cappuccino extends Beverage {
    public String description = "Cappuccino";
    public String getDescription() {
        return description;
    }

    @Override
    public int price(){
        return 1050;
    }
}
