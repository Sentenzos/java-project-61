package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    final static int maxNumber = 100;

    public static void run() {
        var username = Engine.greet();
        Engine.printRules("What is the result of the expression?");

        for (var i = 0; i < Engine.rounds; i++) {
            var roundResult = Calculator.process(i, username);
            if (!roundResult) {
                break;
            }
        }
    }

    public static boolean process(int roundNumber, String username) {
        int number1 = (int) (Math.random() * maxNumber + 1);
        int number2 = (int) (Math.random() * maxNumber + 1);

        String[] operators = {"+", "-", "*"};
        int operatorIndex = Engine.getRandomInt(0, 2);
        var operator = operators[operatorIndex];

        int mathExpressionResult = switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> 0;
        };

        return Engine.handleRound(number1 + " " + operator + " " + number2,
                Integer.toString(mathExpressionResult), roundNumber, username);

    }
}
