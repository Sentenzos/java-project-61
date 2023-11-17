package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALCULATOR = 3;
    static final int GCD_CONST = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println(
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calculator
                        4 - GCD
                        5 - Progression
                        6 - Prime
                        0 - Exit"""
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");

        int gameNumber = scanner.nextInt();

        if (gameNumber == GREET) {
            Cli.greet();
        } else if (gameNumber == EVEN) {
            Even.run();
        } else if (gameNumber == CALCULATOR) {
            Calculator.run();
        } else if (gameNumber == GCD_CONST) {
            GCD.run();
        } else if (gameNumber == PROGRESSION) {
            Progression.run();
        } else if (gameNumber == PRIME) {
            Prime.run();
        }
    }
}
