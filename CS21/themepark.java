import java.util.Scanner;

public class themepark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What day would you like to visit the park?");
        String day = scanner.nextLine().toLowerCase();

        System.out.println("What would you like to eat?");
        String food = scanner.nextLine().toLowerCase();

        double entrancecost;
        switch (day) {
            case "monday":
                entrancecost = 5.0;
                break;
            case "tuesday":
                entrancecost = 4.0;
                break;
            case "wednesday":
                entrancecost = 3.0;
                break;
            default:
                entrancecost = 2.0;
                break;
        }

        double foodcost;
        boolean hasIceCream = false;
        switch (food) {
            case "hotdog":
                foodcost = 2.0;
                break;
            case "fries":
                foodcost = 3.0;
                break;
            case "apple pie":
                foodcost = 5.0;
                System.out.println("Would you like ice cream?");
                String icecream = scanner.nextLine().toLowerCase();
                if (icecream.equals("yes")) {
                    foodcost += 1.0;
                    hasIceCream = true;
                }
                break;
            default:
                foodcost = 0.0;
                break;
        }

        double totalcost = entrancecost + foodcost;
        System.out.printf("You visited the park on %s and ordered %s%s. The total cost of the trip is $%.2f.\n",
                day,
                food,
                hasIceCream ? " with Ice cream" : "",
                totalcost);
    }
}
