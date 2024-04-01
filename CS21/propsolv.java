import java.util.Scanner;
public class propsolv {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);
System.out.print("Give your first value: ");
int a = input.nextInt();

System.out.print("Give your second value: ");
int b = input.nextInt();

System.out.print("Give your third value: ");
int c = input.nextInt();

System.out.println("\n a\tc\n--- =  ---\n b\td");
System.out.println("\nInitial value:\na = "+a+"\nb = "+b+"\nc = "+c);
System.out.println("\nEquation:\n "+a+"\t"+c+"\n--- =  ---\n "+b+"\td\n");

double d  = (double)(c*b)/a;
System.out.println("Solution:\nd= "+d);




}
}