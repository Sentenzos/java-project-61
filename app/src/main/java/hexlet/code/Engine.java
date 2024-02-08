package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int ARGUMENTS_NUMBER = 2;

    public static void handleGame(String rules, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");
        System.out.println(rules);
        for (var i = 0; i < ROUNDS; i++) {
            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + username + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
