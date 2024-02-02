package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final int MAX_VALUE = 100;
    static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void run() {
        String[][] gameData = new String[Engine.ROUNDS][Engine.ARGUMENTS_NUMBER];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String[] roundData = GCD.prepareData();
            gameData[i] = roundData;
        }

        Engine.handleGame(RULES, gameData);
    }

    public static String[] prepareData() {
        int number1 = Util.getRandomInt(1, MAX_VALUE);
        int number2 = Util.getRandomInt(1, MAX_VALUE);

        int minNumber = Math.min(number1, number2);
        int maxNumber = Math.max(number1, number2);

        int gcd = 1;

        for (var j = 1; j <= minNumber; j++) {
            if (minNumber % j == 0 && maxNumber % j == 0) {
                gcd = j;
            }
        }

        String question = minNumber + " " + maxNumber;
        String correctAnswer = Integer.toString(gcd);

        return new String[] {question, correctAnswer};
    }
}

