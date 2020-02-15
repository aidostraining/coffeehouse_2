
/**
 * Created by user on 04.02.2020.
 */
public class Americano extends Beverage {
    private String coffeeName = "Americano";
    public String getCoffeeName() {
                return coffeeName;
    }

    @Override
    public int price(){
        return 750;
    }
}

