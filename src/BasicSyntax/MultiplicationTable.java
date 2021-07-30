package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//Print every row of the table in the following format:
//{theInteger} X {times} = {product}
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            int result = n * multiplier;
            System.out.printf("%d X %d = %d%n", n, multiplier, result);
            multiplier++;
        } while (multiplier <= 10);

    }
}
