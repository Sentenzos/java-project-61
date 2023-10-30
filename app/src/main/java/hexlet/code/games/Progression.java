package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void run() {
        var username = Engine.greet();
        Engine.printRules("What number is missing in the progression?");

        for (var i = 0; i < 3; i++) {
            var maxStartNumber = 25;
            int maxStep = 10;
            int progressionLength = 10;
            int startNumber = (int) (Math.random() * maxStartNumber + 1);
            int step = (int) (Math.random() * maxStep + 1);
            int skippedStep = (int) (Math.random() * progressionLength + 1);

            String progressionNumbersString = "";
            var resultNumber = 0;
            var correctAnswer = 0;

            for (var j = 0; j < progressionLength; j++) {
                if (j == 0) {
                    progressionNumbersString += startNumber;
                    resultNumber += startNumber;
                } else if (j == skippedStep - 1) {
                    progressionNumbersString += " ..";
                    correctAnswer = resultNumber + step;
                    resultNumber += step;
                } else {
                    progressionNumbersString += " " + (resultNumber + step);
                    resultNumber += step;
                }
            }

            var roundResult = Engine.handleRound(progressionNumbersString,
                    Integer.toString(correctAnswer), i, username);

            if (!roundResult) {
                break;
            }
        }
    }
}
