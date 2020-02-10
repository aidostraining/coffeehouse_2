/**
 * Created by user on 04.02.2020.
 */
public abstract class Beverage {
    public String description = "Beverage";
    public String getDescription() {
        return description;
    }
    public abstract int price();
}
