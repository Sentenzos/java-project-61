package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    static final int MAX_NUMBER = 100;
    static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        String[][] gameData = new String[Engine.ROUNDS][Engine.ARGUMENTS_NUMBER];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String[] roundData = Prime.prepareData();
            gameData[i] = roundData;
        }

        Engine.handleGame(RULES, gameData);
    }

    public static String[] prepareData() {
        int randomNumber = Util.getRandomInt(2, MAX_NUMBER);
        String question = Integer.toString(randomNumber);
        String answer = Prime.calculate(randomNumber);

        return new String[] {question, answer};
    }

    private static String calculate(int number) {
        String answer = "yes";
        for (var j = 2; j < number; j++) {
            if (number % j == 0) {
                answer = "no";
                break;
            }
        }

        return answer;
    }
}
