package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    static final int MaxStartNumber = 25;
    static final int MaxStep = 10;
    static final int ProgressionLength = 10;

    public static void run() {
        Engine.printRules("What number is missing in the progression?");
        var username = Engine.greet();

        for (var i = 0; i < Engine.Rounds; i++) {
            var roundResult = Progression.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        int startNumber = (int) (Math.random() * MaxStartNumber + 1);
        int step = Engine.getRandomInt(1, MaxStep);
        int skippedStep = Engine.getRandomInt(1, MaxStep);
        var progressionNumbersString = new StringBuilder();
        int resultNumber = startNumber;
        var correctAnswer = 0;
        for (var j = 0; j < ProgressionLength; j++) {
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
