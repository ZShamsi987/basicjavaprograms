import java.util.Random;
import java.util.Scanner;

public class tutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Multiplication Tutor!");
        System.out.print("What is your name? ");
        String playerName = scanner.nextLine();

        int difficulty = chooseDifficulty(scanner);

        int correctAnswers = 0;
        int totalQuestions = 0;

        while (true) {
            int num1 = random.nextInt(difficulty * 50) + 1;
            int num2 = random.nextInt(difficulty * 50) + 1;

            int userAnswer = askQuestion(scanner, playerName, num1, num2);

            if (userAnswer == -1) {
                break;
            }

            int correctAnswer = num1 * num2;

            checkAnswer(random, userAnswer, correctAnswer);
            totalQuestions++;
        }

        double percentage = calculatePercentage(correctAnswers, totalQuestions);

        printResult(playerName, correctAnswers, totalQuestions, percentage);

        playAgain(scanner);

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }

    public static int chooseDifficulty(Scanner scanner) {
        System.out.println("\nWhat difficulty do you want to play?");
        System.out.println("(1): Numbers 1-50");
        System.out.println("(2): Numbers 1-100");
        System.out.println("(3): Numbers 1-150");
        System.out.println("(4): Numbers 1-200");

        int difficulty;
        do {
            System.out.print("Enter your choice (1-4): ");
            difficulty = scanner.nextInt();
        } while (difficulty < 1 || difficulty > 4);

        return difficulty;
    }

    public static int askQuestion(Scanner scanner, String playerName, int num1, int num2) {
        System.out.print("\n" + playerName + ", what is the product of " + num1 + " and " + num2 + "? ");
        return scanner.nextInt();
    }

    public static void checkAnswer(Random random, int userAnswer, int correctAnswer) {
        if (userAnswer == correctAnswer) {
            switch (random.nextInt(3)) {
                case 0:
                    System.out.println("Good job, kid!");
                    break;
                case 1:
                    System.out.println("Looks like you know your stuff!");
                    break;
                case 2:
                    System.out.println("You're a multiplication master!");
                    break;
            }
        } else {
            switch (random.nextInt(3)) {
                case 0:
                    System.out.println("You are completely stupid.");
                    break;
                case 1:
                    System.out.println("I am giving up on you.");
                    break;
                case 2:
                    System.out.println("Maybe you'll get it next time.");
                    break;
            }
            System.out.println("The right answer was " + correctAnswer + ".");
        }
    }

    public static double calculatePercentage(int correctAnswers, int totalQuestions) {
        return (double) correctAnswers / totalQuestions * 100;
    }

    public static void printResult(String playerName, int correctAnswers, int totalQuestions, double percentage) {
        System.out.println("\nYou got " + correctAnswers + "/" + totalQuestions + ", which is " +
                String.format("%.2f", percentage) + "%.");

        if (percentage == 100) {
            System.out.println("You've mastered multiplication!");
        } else if (percentage >= 93) {
            System.out.println("Outstanding! You earned an A!");
        } else if (percentage >= 90) {
            System.out.println("Great job! You earned an A-!");
        } else if (percentage >= 87) {
            System.out.println("Well done! You earned a B+!");
        } else if (percentage >= 84) {
            System.out.println("Good work! You earned a B!");
        } else if (percentage >= 80) {
            System.out.println("Nice effort! You earned a B-!");
        } else if (percentage >= 77) {
            System.out.println("Keep it up! You earned a C+!");
        } else if (percentage >= 74) {
            System.out.println("Not bad! You earned a C!");
        } else if (percentage >= 70) {
            System.out.println("You passed! You earned a C-!");
        } else if (percentage >= 63) {
            System.out.println("You need improvement. You earned a D!");
        } else {
            System.out.println("Sorry, you failed. You earned an F.");
        }
    }

    public static void playAgain(Scanner scanner) {
        System.out.print("Do you want to play again? (Y/N): ");
        scanner.nextLine();
        while (true) {
            String playAgainChoice = scanner.nextLine();
            if (playAgainChoice.equalsIgnoreCase("Y")) {
                break;
            } else if (playAgainChoice.equalsIgnoreCase("N")) {
                return;
            } else {
                System.out.print("Invalid choice. Enter Y or N: ");
            }
        }
    }
}



