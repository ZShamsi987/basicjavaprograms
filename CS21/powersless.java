import java.util.Scanner;

public class powersless {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int input = scanner.nextInt();

        int power = input;

        System.out.print("The powers of " + input + " that are less than 10000 are ");
        while (power < 10000) {
            System.out.print(power + " ");
            power *= input;
        }

        System.out.println();
    }
}

