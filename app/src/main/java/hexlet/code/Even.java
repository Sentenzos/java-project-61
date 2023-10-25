package hexlet.code;

import java.util.Scanner;

public class Even {
    int count;

    public void run() {
        var greet = new Greet();
        greet.run();
        var username = greet.getUsername();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        startGame(username);
    }

    private void startGame(String username) {
        int random = (int)(Math.random() * 50 + 1);

        System.out.println("Question: " + random);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");

        String answer = scanner.next();

        if ((random % 2 == 0 && answer.equals("yes")) || (random % 2 != 0 && answer.equals("no"))) {
            System.out.println("Correct!");
            this.count += 1;

            if (this.count < 3) {
                startGame(username);
            } else {
                System.out.println("Congratulations, " + username + " !");
            }
        } else {
            System.out.println(
                    "'" + answer + "'" + " is wrong answer ;(. Correct answer was " +
                            (answer.equals("yes") ? "'no'" : "'yes'" + ".")
            );
            System.out.println("Let's try again, " + username);
        }
    }
}
