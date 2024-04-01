import java.util.Scanner;
public class numsqr{
public static void main(String[]args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a number to be squared: ");
	Double num = input.nextDouble();
	Double num1 = num*num;
	System.out.print("Result: "+num1+ "\n\n");

}
}