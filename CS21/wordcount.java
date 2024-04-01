import java.util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Word count: " + wordCount(input));
    }

    public static int wordCount(String input) {
        int wordc = 0;
        boolean inword = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (!inword) {
                    inword = true;
                    wordc++;
                }
            } else {
                inword = false;
            }
        }

        return wordc;
    }
}

