import java.util.Scanner;

public class avgprogwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter a grade:");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            sum += grade;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average: %.1f", average);
            System.out.println("");
        } else {
            System.out.println("No grades were entered.");
        }
    }
}



