package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    public static String username = "";

    public static void greet(String rules) {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);

        String username = scanner.next();
        Engine.username = username;

        System.out.println("Hello, " + username + "!");

        printRules(rules);
    }

    public static void printRules(String rules) {
        System.out.println(rules);
    }

    public static boolean handleRound(String question, String correctAnswer, int currentRound) {
        System.out.println("Question: " + question);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");

        String answer = scanner.next();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");

            if (currentRound == 2) {
                System.out.println("Congratulations, " + username + "!");
            }

            return true;
        } else {
            System.out.println(
                    "'" + answer + "'" + " is wrong answer ;(. Correct answer was " + correctAnswer
            );
            System.out.println("Let's try again, " + username + "!");

            return false;
        }
    }
}
