import java.util.Scanner;

public class quadtest {
public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter angle 1: ");
double a = input.nextInt();

System.out.print("Enter angle 2: ");
double b = input.nextInt();

System.out.print("Enter angle 3: ");
double c = input.nextInt();

double d = 360-a-b-c;

System.out.println("Angle 4 is "+d);

if(a==90 && b==90 && c==90 && d==90){
System.out.println("The quadrillateral is a rectangle");}

else if(a==c && b==d){
System.out.println("The quadrillateral is a parallelogram");}

else{
	System.out.println("It's not a special quadrilateral");}



}
}