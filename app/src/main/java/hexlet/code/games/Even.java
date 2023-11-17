package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int MaxNumber = 50;

    public static void run() {
        var username = Engine.greet();
        Engine.printRules("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < Engine.Rounds; i++) {
            var roundResult = Even.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        int number = (int) (Math.random() * MaxNumber + 1);

        if (number % 2 == 0) {
            return Engine.handleRound(Integer.toString(number), "yes", roundNumber, username);
        } else {
            return Engine.handleRound(Integer.toString(number), "no", roundNumber, username);
        }
    }
}

