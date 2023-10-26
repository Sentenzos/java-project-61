package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void run() {
        var username = Engine.greet();
        Engine.printRules("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            var maxNumber = 50;
            int number = (int) (Math.random() * maxNumber + 1);
            boolean roundResult;

            if (number % 2 == 0) {
                roundResult = Engine.handleRound(Integer.toString(number), "yes", i, username);
            } else {
                roundResult = Engine.handleRound(Integer.toString(number), "no", i, username);
            }

            if (!roundResult) {
                break;
            }
        }
    }
}
