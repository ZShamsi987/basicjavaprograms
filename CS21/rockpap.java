import java.util.Scanner;
import java.util.Random;

public class rockpap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Rules:");
        System.out.println("Rock beats Scissors");
        System.out.println("Scissors beats Paper");
        System.out.println("Paper beats Rock");

        System.out.print("\nEnter difficulty level (0[easiest]-3[hardest]): ");
        int difficulty = scanner.nextInt();

        int userscor = 0;
        int compscor = 0;
        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.println("Enter your move (1: Rock, 2: Paper, 3: Scissors): ");
            int userm = scanner.nextInt();
            int compmove = whatcompdoes(difficulty, round, userm);

            System.out.println("Computer's move: " + convstring(compmove));

            int result = deterW(userm, compmove);

            if (result == 1) {
                System.out.println("You win this round!");
                userscor++;
            } else if (result == -1) {
                System.out.println("Computer wins this round!");
                compscor++;
            } else {
                System.out.println("It's a tie!");
            }
        }

        System.out.println("\nGame Over!");
        if (userscor > compscor) {
            System.out.println("You win the game!");
        } else if (compscor > userscor) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println("It's a tie!");
        }
    }

  public static int whatcompdoes(int difficulty, int round, int userm) {
      Random random = new Random();
      int cheat = random.nextInt(100) + 1;

      if (difficulty == 0) {
          switch (userm) {
              case 1:
                  return 3;
              case 2:
                  return 1;
              case 3:
                  return 2;
              default:
                  return random.nextInt(3) + 1;
          }
      } else if (difficulty == 3) {
          switch (userm) {
              case 1:
                  return 2;
              case 2:
                  return 3;
              case 3:
                  return 1;
              default:
                  return random.nextInt(3) + 1;
          }
      } else if (difficulty * 33 >= cheat || round == 1) {
          return random.nextInt(3) + 1;
      } else {
          return random.nextInt(3) + 1;
      }
  }


    public static int deterW(int userm, int compmove) {
        if (userm == compmove) {
            return 0;
        } else if ((userm == 1 && compmove == 3) ||
                   (userm == 2 && compmove == 1) ||
                   (userm == 3 && compmove == 2)) {
            return 1;
        } else {
            return -1;
        }
    }

    public static String convstring(int move) {
        switch (move) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid move";
        }
    }
}


