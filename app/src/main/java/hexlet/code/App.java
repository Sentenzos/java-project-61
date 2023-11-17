package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    final static int greet = 1;
    final static int even = 2;
    final static int calculator = 3;
    final static int gcd = 4;
    final static int progression = 5;
    final static int prime = 6;

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

        if (gameNumber == greet) {
            Cli.greet();
        } else if (gameNumber == even) {
            Even.run();
        } else if (gameNumber == calculator) {
            Calculator.run();
        } else if (gameNumber == gcd) {
            GCD.run();
        } else if (gameNumber == progression) {
            Progression.run();
        } else if (gameNumber == prime) {
            Prime.run();
        }
    }
}
