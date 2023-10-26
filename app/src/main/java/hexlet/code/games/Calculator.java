package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    public static void run() {
        var username = Engine.greet();
        Engine.printRules("What is the result of the expression?");

        for (var i = 0; i < 3; i++) {
            var maxNumber = 100;
            int number1 = (int) (Math.random() * maxNumber + 1);
            int number2 = (int) (Math.random() * maxNumber + 1);

            String[] operators = {"+", "-", "*"};
            int operatorIndex = (int) (Math.random() * 3 + 1);
            var operator = operators[operatorIndex];

            boolean roundResult;

            int mathExpressionResult = switch (operator) {
                case "+" -> number1 + number2;
                case "-" -> number1 - number2;
                case "*" -> number1 * number2;
                default -> 0;
            };

            roundResult = Engine.handleRound(number1 + operator + number2,
                    Integer.toString(mathExpressionResult), i, username);

            if (!roundResult) {
                break;
            }
        }
    }
}
