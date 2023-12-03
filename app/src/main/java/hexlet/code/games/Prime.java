package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int MAX_NUMBER = 100;

    public static void run() {
        Engine.greet("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var roundResult = Prime.process(i);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber) {
        int randomNumber = Util.getRandomInt(2, MAX_NUMBER);

        var correctAnswer = "yes";

        for (var j = 2; j < randomNumber; j++) {
            if (randomNumber % j == 0) {
                System.out.println(randomNumber);
                correctAnswer = "no";
                break;
            }
        }

        return Engine.handleRound(Integer.toString(randomNumber),
                correctAnswer, roundNumber);
    }
}
