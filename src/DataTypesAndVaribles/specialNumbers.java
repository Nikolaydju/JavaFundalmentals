package DataTypesAndVaribles;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n ; num++) {
            int sum = 0;
            int digit = num;

            while (digit > 0){
                int currentDigit = digit % 10;
                sum = sum + currentDigit;
                digit = digit / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.println(num + " -> True");
            }else {
                System.out.println(num + " -> False");
            }


        }

    }
}
