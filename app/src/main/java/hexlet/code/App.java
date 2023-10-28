package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calculator
                        4 - GCD
                        0 - Exit"""
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");

        int gameNumber = scanner.nextInt();

        if (gameNumber == 1) {
            Cli.greet();
        } else if (gameNumber == 2) {
            Even.run();
        } else if (gameNumber == 3) {
            Calculator.run();
        } else if (gameNumber == 4) {
            GCD.run();
        }
    }
}

