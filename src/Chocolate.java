
/**
 * Created by user on 04.02.2020.
 */
public class Chocolate extends Beverage {
    private String coffeeName = "Hot Chocolate";
    public String getCoffeeName() {
        return coffeeName;
    }

    @Override
    public int price(){
        return 1200;
    }
}
