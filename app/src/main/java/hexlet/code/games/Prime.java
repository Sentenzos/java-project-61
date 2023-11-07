package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void run() {
        var username = Engine.greet();
        Engine.printRules("What is the result of the expression?");

        for (var i = 0; i < 3; i++) {
            int randomNumber = Engine.getRandomInt(2, 100);

            var correctAnswer = "yes";

            for (var j = 2; j < randomNumber; j++) {
                if (randomNumber % j == 0) {
                    System.out.println(randomNumber);
                    correctAnswer = "no";
                    break;
                }
            }

            var roundResult = Engine.handleRound(Integer.toString(randomNumber),
                    correctAnswer, i, username);

            if (!roundResult) {
                break;
            }
        }
    }
}
