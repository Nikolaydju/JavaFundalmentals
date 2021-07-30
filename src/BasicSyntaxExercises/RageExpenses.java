package BasicSyntaxExercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //On the first input line - lost games count – integer in the range [0, 1000].
        //On the second line – headset price - floating point number in range [0, 1000].
        //On the third line – mouse price - floating point number in range [0, 1000].
        //On the fourth line – keyboard price - floating point number in range [0, 1000].
        //On the fifth line – display price - floating point number in range [0, 1000].

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = lostGames / 2;
        int mouseCount = lostGames / 3;
        int keyboardCount = lostGames / 6;
        int displayCount = lostGames / 12;

        double expenses = (headsetCount * headsetPrice) + (mouseCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",expenses);

    }
}
