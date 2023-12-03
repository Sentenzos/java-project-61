package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    static final int MAX_START_NUMBER = 25;
    static final int MAX_STEP = 10;
    static final int PROGRESSION_LENGTH = 10;

    public static void run() {
        Engine.printRules("What number is missing in the progression?");
        var username = Engine.greet();

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var roundResult = Progression.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        int startNumber = (int) (Math.random() * MAX_START_NUMBER + 1);
        int step = Util.getRandomInt(1, MAX_STEP);
        int skippedStep = Util.getRandomInt(1, MAX_STEP);
        var progressionNumbersString = new StringBuilder();
        int resultNumber = startNumber;
        var correctAnswer = 0;
        for (var j = 0; j < PROGRESSION_LENGTH; j++) {
            resultNumber += step;
            if (j == skippedStep - 1) {
                progressionNumbersString.append(" ..");
                correctAnswer = resultNumber;
            } else {
                progressionNumbersString.append(" " + resultNumber);
            }
        }

        return Engine.handleRound(progressionNumbersString.toString().trim(), Integer.toString(correctAnswer),
                roundNumber, username);
    }
}
