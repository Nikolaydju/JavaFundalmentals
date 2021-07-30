package DataTypeAndVariblesExercises;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //You will receive N – an integer, the number of snowballs being made by Tony and Andi.
        //For each snowball you will receive 3 input lines:
        //On the first line you will get the snowballSnow – an integer.
        //On the second line you will get the snowballTime – an integer.
        //On the third line you will get the snowballQuality – an integer.

        int snowballsCount = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int snowballSnowValue = Integer.MIN_VALUE;
        int snowballTimeValue = Integer.MIN_VALUE;
        int snowballQualityValue = Integer.MIN_VALUE;


        for (int i = 1; i <= snowballsCount ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime,snowballQuality);

            if (snowballValue > maxValue){
                maxValue = snowballValue;
                snowballSnowValue = snowballSnow;
                snowballTimeValue = snowballTime;
                snowballQualityValue = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowValue,snowballTimeValue,maxValue,snowballQualityValue);
    }
}
