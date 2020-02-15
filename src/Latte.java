
/**
 * Created by user on 04.02.2020.
 */
public class Latte extends Beverage {
    private String coffeeName = "Latte";
    public String getCoffeeName() {
        return coffeeName;
    }

    @Override
    public int price(){
        return 950;
    }
}
