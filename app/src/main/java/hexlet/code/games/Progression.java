package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void run() {
        Engine.printRules("What number is missing in the progression?");
        var username = Engine.greet();

        for (var i = 0; i < 3; i++) {
            var roundResult = Progression.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        var maxStartNumber = 25;
        int maxStep = 10;
        int progressionLength = 10;
        int startNumber = (int) (Math.random() * maxStartNumber + 1);
        int step = Engine.getRandomInt(1, maxStep);
        int skippedStep = Engine.getRandomInt(1, maxStep);
        var progressionNumbersString = new StringBuilder();
        int resultNumber = startNumber;
        var correctAnswer = 0;
        for (var j = 0; j < progressionLength; j++) {
            resultNumber += step;
            if (j == skippedStep - 1) {
                progressionNumbersString.append(" ..");
                correctAnswer = resultNumber;
            } else {
                progressionNumbersString.append(" " + resultNumber);
            }
        }
        return Engine.handleRound(progressionNumbersString.toString(), Integer.toString(correctAnswer),
                roundNumber, username);
    }
}
