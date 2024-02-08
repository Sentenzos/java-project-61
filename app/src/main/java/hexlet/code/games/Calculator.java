package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calculator {
    static final int MAX_NUMBER = 100;
    static final String RULES = "What is the result of the expression?";

    public static void run() {
        String[][] gameData = new String[Engine.ROUNDS][Engine.ARGUMENTS_NUMBER];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String[] roundData = prepareData();
            gameData[i] = roundData;
        }

        Engine.handleGame(RULES, gameData);
    }

    private static String[] prepareData() {
        int number1 = Util.getRandomInt(1, MAX_NUMBER);
        int number2 = Util.getRandomInt(1, MAX_NUMBER);

        String[] operators = {"+", "-", "*"};
        int operatorIndex = Util.getRandomInt(0, 2);
        var operator = operators[operatorIndex];
        String question = number1 + " " + operator + " " + number2;
        String answer = calculate(number1, number2, operator);

        return new String[]{question, answer};
    }

    private static String calculate(int number1, int number2, String operator) {
        int mathExpressionResult = switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> 0;
        };

        return Integer.toString(mathExpressionResult);
    }
}
