package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    static final int MAX_NUMBER = 50;
    static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        String[][] gameData = new String[Engine.ROUNDS][Engine.ARGUMENTS_NUMBER];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String[] roundData = prepareData();
            gameData[i] = roundData;
        }

        Engine.handleGame(RULES, gameData);
    }

    private static String[] prepareData() {
        int number = Util.getRandomInt(1, MAX_NUMBER);
        String question = Integer.toString(number);
        String answer = isEven(number) ? "yes" : "no";

        return new String[]{question, answer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

