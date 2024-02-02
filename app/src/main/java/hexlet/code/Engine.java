package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int ARGUMENTS_NUMBER = 2;
    private static String name = "";

    public static void greet(String rules) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        Engine.name = username;
        System.out.println("Hello, " + username + "!");
        System.out.println(rules);
    }

    public static boolean handleRound(String[] roundData, int currentRound) {
        String question = roundData[0];
        String correctAnswer = roundData[1];

        System.out.println("Question: " + question);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String answer = scanner.next();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            if (currentRound == Engine.ROUNDS) {
                System.out.println("Congratulations, " + name + "!");
            }
            return true;
        } else {
            System.out.println(
                    "'" + answer + "'" + " is wrong answer ;(. Correct answer was " + correctAnswer
            );
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
    }

    public static void handleGame(String rules, String[][] gameData) {
        Engine.greet(rules);
        for (var i = 0; i < Engine.ROUNDS; i++) {
            boolean roundResult = Engine.handleRound(gameData[i], i + 1);
            if (!roundResult) {
                break;
            }
        }
    }
}
