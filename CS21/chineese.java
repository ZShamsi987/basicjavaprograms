import java.util.Scanner;

public class chineese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter hour of the day: ");
        int hour = scanner.nextInt();
        System.out.print("Please enter minute of hour: ");
        int minute = scanner.nextInt();
        System.out.print("Please enter (A)M or (P)M: ");
        String amPm = scanner.next();
        String zodiac = getzodiac(hour, amPm);
        System.out.println("Your Chinese zodiac is the " + zodiac + ".");
    }

    public static String getzodiac(int hour, String amPm) {
        if (amPm.equalsIgnoreCase("P")) {
            hour += 12;
        }
        if (hour == 24) {
            hour = 0;
        }
        switch (hour) {
            case 23:
            case 0:
                return "Rat";
            case 1:
            case 2:
                return "Ox";
            case 3:
            case 4:
                return "Tiger";
            case 5:
            case 6:
                return "Rabbit";
            case 7:
            case 8:
                return "Dragon";
            case 9:
            case 10:
                return "Snake";
            case 11:
            case 12:
                return "Horse";
            case 13:
            case 14:
                return "Goat";
            case 15:
            case 16:
                return "Monkey";
            case 17:
            case 18:
                return "Rooster";
            case 19:
            case 20:
                return "Dog";
            default:
                return "Pig";
        }
    }
}






