package BasicSyntaxExercises;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        if (day.equals("Friday")) {
            if (type.equals("Students")) {
                price = people * 8.45;
            } else if (type.equals("Business")) {
                price = people * 10.90;
            } else if (type.equals("Regular")) {
                price = people * 15;
            }
        } else if (day.equals("Saturday")) {
            if (type.equals("Students")) {
                price = people * 9.80;
            } else if (type.equals("Business")) {
                price = people * 15.60;
            } else if (type.equals("Regular")) {
                price = people * 20;
            }
        } else if (day.equals("Sunday")) {
            if (type.equals("Students")) {
                price = people * 10.46;
            } else if (type.equals("Business")) {
                price = people * 16;
            } else if (type.equals("Regular")) {
                price = people * 22.50;
            }
        }

        if (type.equals("Students")) {
            if (people >= 30) {
                totalPrice = price - (price * 0.15);
            }
        } else if (type.equals("Business")) {
            if (people >= 100) {
                totalPrice = price - (10 * price);
            }
        } else if (type.equals("Regular")) {
            if (people >= 10 && people <= 20) {
                totalPrice = price - (price * 0.05);

            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
