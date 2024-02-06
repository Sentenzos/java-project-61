package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    static final int MAX_START_NUMBER = 25;
    static final int MAX_STEP = 10;
    static final int PROGRESSION_LENGTH = 10;
    static final String RULES = "What number is missing in the progression?";

    public static void run() {
        String[][] gameData = new String[Engine.ROUNDS][Engine.ARGUMENTS_NUMBER];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String[] roundData = Progression.prepareData();
            gameData[i] = roundData;
        }

        Engine.handleGame(RULES, gameData);
    }

    public static String[] prepareData() {
        int startNumber = Util.getRandomInt(1, MAX_START_NUMBER);
        int step = Util.getRandomInt(1, MAX_STEP);
        int skippedStep = Util.getRandomInt(1, MAX_STEP);
        String[] progressionArray = new String[PROGRESSION_LENGTH];
        int resultNumber = startNumber;
        for (var j = 0; j < PROGRESSION_LENGTH; j++) {
            resultNumber += step;
            progressionArray[j] = Integer.toString(resultNumber);
        }
        progressionArray[skippedStep - 1] = "..";

        String question = String.join(" ", progressionArray);
        String answer = calculate(startNumber, step, skippedStep);

        return new String[] {question, answer};
    }

    private static String calculate(int startNumber, int step, int skippedStep) {
        int tempNumber = startNumber;
        int answer = 0;
        for (var j = 0; j < PROGRESSION_LENGTH; j++) {
            tempNumber += step;
            if (j == skippedStep - 1) {
                answer = tempNumber;
            }
        }

        return Integer.toString(answer);
    }
}
