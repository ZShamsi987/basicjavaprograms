import java.util.Random;

public class tentenarray {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(89) + 11;
            }
        }

        System.out.println("Generated Array:");
        printArray(array);


        System.out.println("\nSum and Minimum of Each Row:");
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 10; j++) {
                sum += array[i][j];
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + ": Sum = " + sum + ", Minimum = " + min);
        }


        System.out.println("\nSum and Minimum of Each Column:");
        for (int j = 0; j < 10; j++) {
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                sum += array[i][j];
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            System.out.println("Column " + (j + 1) + ": Sum = " + sum + ", Minimum = " + min);
        }

        int totalSum = 0;
        int overallMin = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                totalSum += array[i][j];
                if (array[i][j] < overallMin) {
                    overallMin = array[i][j];
                }
            }
        }
        System.out.println("\nTotal Sum = " + totalSum);
        System.out.println("Overall Minimum = " + overallMin);
    }


    public static void printArray(int[][] array) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
