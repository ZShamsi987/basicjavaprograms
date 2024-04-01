import java.util.Scanner;

public class consec {
    public static boolean areConsec(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;
        return (mid - min == 1 && max - mid == 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers separated by spaces: ");
        String input = scanner.nextLine();

        Scanner stringScanner = new Scanner(input);

        int a = stringScanner.nextInt();
        int b = stringScanner.nextInt();
        int c = stringScanner.nextInt();

        boolean result = areConsec(a, b, c);
        System.out.println("Are the numbers consecutive? " + result);


    }
}

