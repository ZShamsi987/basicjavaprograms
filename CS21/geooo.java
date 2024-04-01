
import java.util.Scanner;
public class geooo
{
	static double length;
	static double width;
	static double side;
	static double base;
	static double height;
	static double dia;
	static double radius;
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("What do you find? (A)rea of rectangle, (P)erimeter of a square, Area of (T)riangle, (C)ircumference of a circle with given diameter, Circumference of a circle if given (R)adius? ");
String str = reader.nextLine();

if(str.equals("A")){
System.out.print("what is the length of rect: ");
double length = reader.nextInt();
System.out.print("what is the width of rect: ");
double width = reader.nextInt();

System.out.println("");
System.out.println("area is: "+ rect(length, width));

}

if(str.equals("P")){
System.out.print("what is the side length of square: ");
double side = reader.nextInt();

System.out.println("");
System.out.println("perimeter is: "+sqr(side));

}

if(str.equals("T")){
System.out.print("what is the base of triangle: ");
double base = reader.nextInt();
System.out.println("what is the height of tri: ");
double height = reader.nextInt();

System.out.println("");
System.out.println("area is: "+tri(base, height));
}

if(str.equals("C")){
	System.out.print("what is the dia of circle: ");
	double dia = reader.nextInt();

System.out.println("");
System.out.println("circumfrence is: "+circo(dia));


}

if(str.equals("R")){
	System.out.print("what is the radius of circle: ");
	double radius = reader.nextInt();

System.out.println("");
System.out.println("circumfrence is: "+circt(radius));

}


}

public static double rect(double length, double width){
double q = length*width;
double a = (double)(Math.round(q*100))/100;
return a;
}

public static double sqr(double side){
double w = side*4;
double s = (double)(Math.round(w*100))/100;
return s;
}

public static double tri(double base, double height){
double e = 0.5*base*height;
double d = (double)(Math.round(e*100))/100;
return d;
}

public static double circo(double dia){
double r = 3.14*dia;
double f = (double)(Math.round(r*100))/100;
return f;
}

public static double circt(double radius){
double t = 2*3.14*radius;
double g = (double)(Math.round(t*100))/100;
return g;
}
}


