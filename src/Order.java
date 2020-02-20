import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by user on 10.02.2020.
 */
public class Order {
    Latte latte = new Latte();
    Cappuccino cappuccino = new Cappuccino();
    Americano americano = new Americano();
    Chocolate chocolate = new Chocolate();
    private int coffee;
    final int LATTE_NUM = 1;
    final int CAPPUCCINO_NUM = 2;
    final int AMERICANO_NUM = 3;
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
                switch (coffee) {
                    case LATTE_NUM:
                        latte.speakOut();
                        break;
                    case CAPPUCCINO_NUM:
                        cappuccino.speakOut();
                        break;
                    case AMERICANO_NUM:
                        americano.speakOut();
                        break;
                    default:
                        System.out.println(list.INCORRECT_NUMBER);
                }
            }
            else if (coffeeNum == 2) {
                chocolate.speakOut();
            }
            else {
                System.out.println(list.INCORRECT_NUMBER);
            }
        }catch (Exception e) {
            System.err.println(list.INCORRECT_NUMBER);
        }
    }
}
