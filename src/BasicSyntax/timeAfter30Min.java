package BasicSyntax;

import java.util.Scanner;

public class timeAfter30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        min = min + 30;

        if (min >= 60) {
            min = min - 60;
            hours++;
        }
        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, min);
    }
}
