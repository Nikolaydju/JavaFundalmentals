package BasicSyntax;

import java.util.Scanner;

public class sumOddNumbs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            int oddNumb = i * 2 - 1;
            System.out.println(oddNumb);

            sum += oddNumb;
        }
        System.out.printf("Sum: %d",sum);
    }
}
