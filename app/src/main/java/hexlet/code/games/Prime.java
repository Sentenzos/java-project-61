package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int MAX_NUMBER = 100;
    static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        String[][] gameData = new String[Engine.ROUNDS][Engine.ARGUMENTS_NUMBER];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String[] roundData = Prime.prepareData();
            gameData[i] = roundData;
        }

        Engine.handleGame(RULES, gameData);
    }

    public static String[] prepareData() {
        int randomNumber = Util.getRandomInt(2, MAX_NUMBER);

        String question = Integer.toString(randomNumber);
        String correctAnswer = "yes";

        for (var j = 2; j < randomNumber; j++) {
            if (randomNumber % j == 0) {
                correctAnswer = "no";
                break;
            }
        }

        return new String[] {question, correctAnswer};
    }
}
