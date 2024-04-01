import java.util.Random;

public class fifran {
    public static void main(String[] args) {

        int[] ranum = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            ranum[i] = random.nextInt(40) + 1;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(ranum[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        int sumnum = 0;
        for (int ran : ranum) {
            sumnum += ran;
        }

        double avg = (double) sumnum / 50;

        int min = ranum[0];
        for (int ran : ranum) {
            if (ran < min) {
                min= ran;
            }
        }

        int max = ranum[0];
        for (int ran : ranum) {
            if (ran > max) {
                max = ran;
            }
        }

        System.out.println("Sum: " + sumnum);
        System.out.println("Average: "+ avg);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}


