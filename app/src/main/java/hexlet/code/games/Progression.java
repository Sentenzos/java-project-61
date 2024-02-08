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
            String[] roundData = prepareData();
            gameData[i] = roundData;
        }

        Engine.handleGame(RULES, gameData);
    }

    private static String[] prepareData() {
        int startNumber = Util.getRandomInt(1, MAX_START_NUMBER);
        int step = Util.getRandomInt(1, MAX_STEP);
        int skippedStep = Util.getRandomInt(1, MAX_STEP);
        String[] progressionArray = getProgression(startNumber, step);
        String answer = progressionArray[skippedStep - 1];
        progressionArray[skippedStep - 1] = "..";
        String question = String.join(" ", progressionArray);

        return new String[] {question, answer};
    }

    private static String[] getProgression(int startNumber, int step) {
        int tempNumber = startNumber;
        String[] progressionArray = new String[PROGRESSION_LENGTH];
        for (var j = 0; j < PROGRESSION_LENGTH; j++) {
            tempNumber += step;
            progressionArray[j] = Integer.toString(tempNumber);
        }

        return progressionArray;
    }
}
