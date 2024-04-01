import java.util.Scanner;
public class physform{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("1. The Height: h=-4.9t^2+b");
System.out.print("What is t(seconds): ");
double t1 = input.nextInt();
System.out.print("What is b(initial height): ");
double b1 = input.nextInt();
System.out.println("");

System.out.println("2. The Velocity: v=vo-9.8*t");
System.out.print("What is vo(initial velocity): ");
double vo1 = input.nextInt();
System.out.print("What is t(seconds): ");
double t2 = input.nextInt();
System.out.println("");

System.out.println("3. The Avg Velocity: v=(x2-x1)/(b-a)");
System.out.print("What is x1(pos1): ");
double x1 = input.nextInt();
System.out.print("What is a(time at pos1): ");
double a = input.nextInt();
System.out.print("What is x2(pos2): ");
double x2 = input.nextInt();
System.out.print("What is b(time at pos2): ");
double b = input.nextInt();
System.out.println("");
System.out.println("");

System.out.print("Height is: ");
System.out.print(height(t1, b1)+"m");
System.out.println("");

System.out.print("Projectile velocity is: ");
System.out.print(velocity(vo1, t2)+"m/s");
System.out.println("");

System.out.print("Average velocity is: ");
System.out.print(avgvelocity(x1, a, x2, b)+"m/s");
System.out.println("");

}

public static double height(double t1, double b1){
double h = -4.9*t1*t1+b1;
double q = (double)(Math.round(h*100))/100;
return q;
}

public static double velocity(double vo1, double t2){
double v = vo1-9.8*t2;
double w = (double)(Math.round(v*100))/100;
return w;
}

public static double avgvelocity(double x1, double a, double x2, double b){
double avgv = (x2-x1)/(b-a);
double e = (double)(Math.round(avgv*100))/100;
return e;
}

}