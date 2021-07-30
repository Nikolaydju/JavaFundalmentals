package BasicSyntax;

import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;
        boolean isTrue = false;

        if (day.equals("Weekday")) {
            if (age >= 0 && age <= 18 || (age > 64 && age <= 122)) {
                ticketPrice = 12;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 18;
            } else {
                isTrue = true;
            }
        } else if (day.equals("Weekend")) {
            if (age >= 0 && age <= 18 || (age > 64 && age <= 122)) {
                ticketPrice = 15;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 20;
            } else {
                isTrue = true;
            }
        } else if (day.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 5;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 12;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 10;
            } else {
                isTrue = true;
            }
        }
        if (isTrue) {
            System.out.println("Error!");
        } else {
            System.out.println(ticketPrice + "$");

        }

    }
}