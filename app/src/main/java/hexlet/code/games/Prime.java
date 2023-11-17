package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    final static int maxNumber = 100;

    public static void run() {
        var username = Engine.greet();
        Engine.printRules("What is the result of the expression?");

        for (var i = 0; i < Engine.rounds; i++) {
            var roundResult = Prime.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        int randomNumber = Engine.getRandomInt(2, maxNumber);

        var correctAnswer = "yes";

        for (var j = 2; j < randomNumber; j++) {
            if (randomNumber % j == 0) {
                System.out.println(randomNumber);
                correctAnswer = "no";
                break;
            }
        }

        return Engine.handleRound(Integer.toString(randomNumber),
                correctAnswer, roundNumber, username);
    }
}
