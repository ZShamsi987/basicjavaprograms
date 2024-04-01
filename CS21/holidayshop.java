
import java.util.Scanner;

public class holidayshop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the regular price of the item: ");
    double reg= scanner.nextDouble();

    System.out.print(
        "Enter the department code (310 for Audio, 438 for Video, 652 for Communications, or any department you choose): ");
    int depart = scanner.nextInt();

    double discount = 0.0;

    switch (depart) {
      case 310:
        discount = 0.10;
        break;

      case 438:
        discount = 0.12;
        break;

      case 652:
        discount = 0.15;
        break;

      default:
        discount = 0.05;
        break;
    }

    double sale = reg - (reg * discount);

    System.out.printf("Regular Price: $%.2f%n", reg);
    System.out.printf("Sale Price: $%.2f%n", Math.round(sale * 100.0) / 100.0);

  }
}

