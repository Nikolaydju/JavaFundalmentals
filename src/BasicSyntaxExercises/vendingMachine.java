package BasicSyntaxExercises;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double coinsCount = 0;

        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);
            //0.1, 0.2, 0.5, 1, and 2 coins
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                coinsCount = coinsCount + coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }

            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        boolean invalidProduct = false;
        double productPrice = 0;
        while (!command.equals("End")) {
            if (command.equals("Nuts")) {
                productPrice = 2.0;
            } else if (command.equals("Water")) {
                productPrice = 0.7;
            } else if (command.equals("Crisps")) {
                productPrice = 1.5;
            } else if (command.equals("Soda")) {
                productPrice = 0.8;
            } else if (command.equals("Coke")) {
                productPrice = 1.0;
            } else {
                invalidProduct = true;

            }
            coinsCount = coinsCount - productPrice;

            if (invalidProduct) {
                System.out.printf("Invalid product%n");
            } else if (coinsCount >= 0) {
                System.out.printf("Purchased %s%n", command);
            } else {
                System.out.printf("Sorry, not enough money%n");
                coinsCount = coinsCount + productPrice;
            }
            command = scanner.nextLine();
            invalidProduct = false;
            productPrice = 0;
        }
        System.out.printf("Change: %.2f", coinsCount);


    }
}
