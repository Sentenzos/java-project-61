package hexlet.code;

import java.util.Scanner;

public class Greet {
    private String username;

    public void run() {
        System.out.println("Welcome to the Brain Games!");


        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);

        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        this.username = username;
    }

   public String getUsername() {
        return this.username;
   }
}
