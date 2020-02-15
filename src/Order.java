import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by user on 10.02.2020.
 */
public class Order {
    private int coffee;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public void orderTalk() {
        BaristaList list = new BaristaList();
        list.baristaGreeting();
        try {
            int coffeeNum = Integer.parseInt(reader.readLine());
            if (coffeeNum == 1) {
                System.out.println("Enter number for coffee you want to choose:");
                System.out.println("1 for Latte \n" +
                        "2 for Cappuccino \n" + "3 for Americano \n");
                coffee = Integer.parseInt(reader.readLine());
                final int LATTE_NUM = 1;
                final int CAPPUCCINO_NUM = 2;
                final int AMERICANO_NUM = 3;
                switch (coffee) {
                    case LATTE_NUM:
                        Latte latte = new Latte();
                        System.out.println("Your " + latte.getCoffeeName() + ", " + latte.price() + " tenge");
                        System.out.println("Thank you for choosing our Coffee Hause!");
                        break;

                    case CAPPUCCINO_NUM:
                        Cappuccino cappuccino = new Cappuccino();
                        System.out.println("Your " + cappuccino.getCoffeeName() + ", " + cappuccino.price() + " tenge");
                        System.out.println("Thank you for choosing our Coffee Hause!");
                        break;

                    case AMERICANO_NUM:
                        Americano americano = new Americano();
                        System.out.println("Your " + americano.getCoffeeName() + ", " + americano.price() + " tenge");
                        System.out.println("Thank you for choosing our Coffee Hause!");
                        break;
                    default:
                        System.out.println("Please, try input right number");
                }
            }
            else if (coffeeNum == 2) {
                Chocolate chocolate = new Chocolate();
                System.out.println("Your " + chocolate.getCoffeeName() + ", " + chocolate.price() + " tenge");
                System.out.println("Thank you for choosing our Coffee Hause!");
            }
            else {
                System.out.println("Please, try input right number");
            }
        }catch (Exception e) {
            System.err.println("Please, try input right number");
        }
    }
}
