
/**
 * Created by user on 04.02.2020.
 */
public class Latte extends Beverage {
    private String coffeeName = "Latte";
    public String getCoffeeName() {
        return coffeeName;
    }

    protected void speakOut(){
        System.out.println("Your " + getCoffeeName() + ", " + price() + " tenge");
        System.out.println("Thank you for choosing our Coffee Hause!");
    }

    @Override
    public int price(){
        return 950;
    }
}
