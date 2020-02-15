
/**
 * Created by user on 04.02.2020.
 */
public class Cappuccino extends Beverage {
    private String coffeeName = "Cappuccino";
    public String getCoffeeName() {
        return coffeeName;
    }

    @Override
    public int price(){
        return 1050;
    }
}
