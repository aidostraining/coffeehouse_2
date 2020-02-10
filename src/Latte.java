
/**
 * Created by user on 04.02.2020.
 */
public class Latte extends Beverage {
    public String description = "Latte";
    public String getDescription() {
        return description;
    }

    @Override
    public int price(){
        return 950;
    }
}
