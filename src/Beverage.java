/**
 * Created by user on 04.02.2020.
 */
public abstract class Beverage {
    private String coffeeName = "Beverage";
    public String getCoffeeName() {
        return coffeeName;
    }
    public abstract int price();
}
