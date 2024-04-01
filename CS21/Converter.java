import java.util.Scanner;

public class Converter
{
public static void main(String[] args)
{
Scanner Input = new Scanner(System.in);
System.out.print("Enter temperature in celsius: ");
double C = Input.nextDouble();
double F = (9/5.0)*C+32;
System.out.println("Temprature in Fareinheit is " +F);
}
}