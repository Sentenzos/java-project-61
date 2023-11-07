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
            int step = Engine.getRandomInt(1, maxStep);
            int skippedStep = Engine.getRandomInt(1, maxStep);

            String progressionNumbersString = "";
            var resultNumber = 0;
            var correctAnswer = 0;

            for (var j = 0; j < progressionLength; j++) {
                if (j == 0) {
                    resultNumber += startNumber;
                    if (skippedStep == 0) {
                        progressionNumbersString = "..";
                        correctAnswer = resultNumber;
                    } else {
                        progressionNumbersString += startNumber;
                    }
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

