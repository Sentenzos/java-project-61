package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    static final int GreetConst = 1;
    static final int EvenConst = 2;
    static final int CalculatorConst = 3;
    static final int GcdConst = 4;
    static final int ProgressionConst = 5;
    static final int PrimeConst = 6;

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

        if (gameNumber == GreetConst) {
            Cli.greet();
        } else if (gameNumber == EvenConst) {
            Even.run();
        } else if (gameNumber == CalculatorConst) {
            Calculator.run();
        } else if (gameNumber == GcdConst) {
            GCD.run();
        } else if (gameNumber == ProgressionConst) {
            Progression.run();
        } else if (gameNumber == PrimeConst) {
            Prime.run();
        }
    }
}
