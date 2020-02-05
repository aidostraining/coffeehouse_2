
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BaristaList list = new BaristaList("Hello! What would you like to order?"
                + "\n Don't hesitate and Enter 1 number to get best Coffee" +
                "\n Or if you want Chocolate Enter number 2  ");
        System.out.println(list.listMenu);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int coffee;
        while (true) {
            try {
                int coffeeNumber = Integer.parseInt(reader.readLine());
                if (coffeeNumber == 1) {
                    System.out.println("Enter number for coffee you want to choose:");
                    System.out.println("1 for Latte \n" +
                            "2 for Cappuccino \n" + "3 for Americano \n");
                    coffee = Integer.parseInt(reader.readLine());
                    switch (coffee) {
                        case (1):
                            Latte latte = new Latte();
                            System.out.println(latte.getDescription() + " " + latte.price() + " tenge");
                            System.out.println("Thank you for choosing our Coffee Hause!");
                            break;

                        case (2):
                            Cappuccino cappuccino = new Cappuccino();
                            System.out.println(cappuccino.getDescription() + " " + cappuccino.price() + " tenge");
                            System.out.println("Thank you for choosing our Coffee Hause!");
                            break;

                        case (3):
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
                            break;
                    }else {
                    System.out.println("Please, try input right number");

                }
                }catch (Exception exc) {
                System.err.println("Please, try input right number");
            }

            }
        }

    }
