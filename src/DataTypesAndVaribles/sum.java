package DataTypesAndVaribles;

import java.math.BigDecimal;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
