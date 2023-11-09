package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void run() {
        var username = Engine.greet();
        Engine.printRules("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            var roundResult = Even.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        var maxNumber = 50;
        int number = (int) (Math.random() * maxNumber + 1);

        if (number % 2 == 0) {
            return Engine.handleRound(Integer.toString(number), "yes", roundNumber, username);
        } else {
            return Engine.handleRound(Integer.toString(number), "no", roundNumber, username);
        }
    }
}

