package DataTypeAndVariblesExercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalAmount = 0;


        while (yield >= 100){
            int workedSpices = yield - 26;
            totalAmount = totalAmount + workedSpices;
            yield = yield - 10;
            days++;

        }

        System.out.println(days);
        System.out.println(totalAmount - 26);
    }
}
