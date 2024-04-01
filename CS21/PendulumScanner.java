import java.util.Scanner;

public class PendulumScanner
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter pendulum length (in meters): ");
		double length = input.nextDouble();
		double gravity = 9.8;
		double pi = 3.1416;
		double Time = 2*pi*Math.sqrt(length/gravity);
		System.out.println("Pendulum period is  " +Time+" seconds");


	}

}