package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
                        5 - Progression
                        6 - Prime
                        0 - Exit"""
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");

        String gameNumber = Integer.toString(scanner.nextInt());

        switch (gameNumber) {
            case "1" -> Cli.greet();
            case "2" -> Even.run();
            case "3" -> Calculator.run();
            case "4" -> GCD.run();
            case "5" -> Progression.run();
            case "6" -> Prime.run();
            default -> {
            }
        }
    }
}
