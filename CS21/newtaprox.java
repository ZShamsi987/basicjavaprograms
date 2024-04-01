
public class newtaprox
{
public static void main(String[]args)
{

int max = 300;
int min = 45;
int range = max - min + 1;
for (int i = 0; i < 1; i++) {
int y = (int)(Math.random() * range) + min;
System.out.println("Value to estimate sqaure root: " + y);

int initial = (y/2);
double x = 1;
System.out.println("Initial guess is: " + initial);
double x1 = ((y/x)+x)/2;
double x2 = ((y/x1)+x1)/2;
double x3 = ((y/x2)+x2)/2;
double x4 = ((y/x3)+x3)/2;
double x5 = ((y/x4)+x4)/2;
double x6 = ((y/x5)+x5)/2;
double x7 = ((y/x6)+x6)/2;
double x8 = ((y/x7)+x7)/2;

  System.out.println("Step 1: "+ x2);
  System.out.println("Step 2: "+ x3);
  System.out.println("Step 3: "+ x4);
  System.out.println("Step 4: "+ x5);
  System.out.println("Step 5: "+ x6);
  System.out.println("Step 6: "+ x7);
  System.out.println("Step 7: "+ x8);

  System.out.println("Best estimate after 7 iterations: " + x8);


}


}
}