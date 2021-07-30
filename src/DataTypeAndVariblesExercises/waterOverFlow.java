package DataTypeAndVariblesExercises;

import java.util.Scanner;

public class waterOverFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = 0;

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= lines ; i++) {
            int quantityWater = Integer.parseInt(scanner.nextLine());
            if (capacity + quantityWater <= 255){
                capacity = capacity + quantityWater;
            }else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(capacity);
    }
}
