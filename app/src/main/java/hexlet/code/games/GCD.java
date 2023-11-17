package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final int MAX_VALUE = 100;

    public static void run() {
        var username = Engine.greet();
        Engine.printRules("Find the greatest common divisor of given numbers.");

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var roundResult = GCD.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        int number1 = Engine.getRandomInt(1, MAX_VALUE);
        int number2 = Engine.getRandomInt(1, MAX_VALUE);

        int minNumber = Math.min(number1, number2);
        int maxNumber = Math.max(number1, number2);

        int gcd = 1;

        for (var j = 1; j <= minNumber; j++) {
            if (minNumber % j == 0 && maxNumber % j == 0) {
                gcd = j;
            }
        }

        return Engine.handleRound(minNumber + " " + maxNumber,
                Integer.toString(gcd), roundNumber, username);
    }
}

