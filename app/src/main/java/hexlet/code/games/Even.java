package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int MAX_NUMBER = 50;

    public static void run() {
        Engine.greet("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var roundResult = Even.process(i);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber) {
        int number = Util.getRandomInt(1, MAX_NUMBER);

        if (number % 2 == 0) {
            return Engine.handleRound(Integer.toString(number), "yes", roundNumber);
        } else {
            return Engine.handleRound(Integer.toString(number), "no", roundNumber);
        }
    }
}

