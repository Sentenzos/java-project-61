package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void run() {
        var username = Engine.greet();
        Engine.printRules("Find the greatest common divisor of given numbers.");

        for (var i = 0; i < 3; i++) {
            var maxValue = 100;
            int number1 = (int) (Math.random() * maxValue + 1);
            int number2 = (int) (Math.random() * maxValue + 1);

            int minNumber = Math.min(number1, number2);
            int maxNumber = Math.max(number1, number2);

            int gcd = 1;

            for (var j = 1; j < minNumber; j++) {
                if (minNumber % j == 0 && maxNumber % j == 0) {
                    gcd = j;
                }
            }


            boolean roundResult =
                    Engine.handleRound(minNumber + " " + maxNumber, Integer.toString(gcd), i, username);


            if (!roundResult) {
                break;
            }
        }
    }
}
