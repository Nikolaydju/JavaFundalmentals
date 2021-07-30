package BasicSyntaxExercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pass = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            pass = pass + currentSymbol;
        }
        String password = scanner.nextLine();
        boolean isTrue = false;
        int counter = 1;

        while (!password.equals(pass)) {
            System.out.println("Incorrect password. Try again.");
            counter++;
            password = scanner.nextLine();
            if (counter == 4) {
                isTrue = true;
                System.out.printf("User %s blocked!",username);
                break;
            }
        }
        if (password.equals(pass))
        System.out.printf("User %s logged in.", username);
    }
}
