
/**
 * Created by user on 04.02.2020.
 */
public class Americano extends Beverage {
    public String description = "Americano";
    public String getDescription() {
        return description;
    }

    @Override
    public int price(){
        return 750;
    }
}
