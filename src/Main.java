
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BaristaList list = new BaristaList("Hello! What would you like to order?"
        + "\n Don't hesitate and Enter 1 number to get best Coffee" + "\n Or if you want Chocolate Enter number 2  ");
        System.out.println(list.listMenu);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            final int COFFEE;
            try {
                int coffeeNumber = Integer.parseInt(reader.readLine());
                if (coffeeNumber == 1) {
                    System.out.println("Enter number for coffee you want to choose:");
                    System.out.println("1 for Latte \n" + "2 for Cappuccino \n" + "3 for Americano \n");
                    COFFEE = Integer.parseInt(reader.readLine());
                    final int LATTE_NUM = 1;
                    final int CAPPUCCINO_NUM = 2;
                    final int AMERICANO_NUM = 3;
                    switch (COFFEE) {
                        case LATTE_NUM:
                            Latte latte = new Latte();
                            System.out.println(latte.getDescription() + " " + latte.price() + " tenge");
                            System.out.println("Thank you for choosing our Coffee Hause!");
                            break;

                        case CAPPUCCINO_NUM:
                            Cappuccino cappuccino = new Cappuccino();
                            System.out.println(cappuccino.getDescription() + " " + cappuccino.price() + " tenge");
                            System.out.println("Thank you for choosing our Coffee Hause!");
                            break;

                        case AMERICANO_NUM:
                            Americano americano = new Americano();
                            System.out.println(americano.getDescription() + " " + americano.price() + " tenge");
                            System.out.println("Thank you for choosing our Coffee Hause!");
                            break;
                        default:
                            System.out.println("Please, try input right number");
                                    }
                    } else if (coffeeNumber == 2) {
                            Chocolate chocolate = new Chocolate();
                            System.out.println(chocolate.getDescription() + " " + chocolate.price() + " tenge");
                            System.out.println("Thank you for choosing our Coffee Hause!");
                           
                    }else {
                    System.out.println("Please, try input right number");

                }
                }catch (Exception exc) {
                System.err.println("Please, try input right number");
                }
        }

    }
