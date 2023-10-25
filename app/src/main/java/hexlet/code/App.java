package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit"
        );


        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");

        int gameNumber = scanner.nextInt();

        if (gameNumber == 1) {
            Cli.greet();
        } else if (gameNumber == 2) {
            var even = new Even();
            even.run();
        }
    }
}

