package DataTypeAndVariblesExercises;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int code = startNum; code <= endNum; code++) {
            System.out.print((char)code + " ");

        }
    }
}
