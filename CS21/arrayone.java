import java.util.Random;

public class arrayone {
    public static void main(String[] args) {

        int[] randomarray = new int[10];
        int sum = 0;

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomno = rand.nextInt(11) + 5;
            randomarray[i] = randomno;
            sum += randomno;
        }

        System.out.println("Array:");
        for (int num : randomarray) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum of the array: " + sum);
    }
}

