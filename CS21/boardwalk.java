
import java.util.Scanner;
public class boardwalk{
public static void main(String args[])
{

double foodi=0;
double drinki=0;
String foods="y";
String drinks="a";
double po=0;

Scanner reader = new Scanner(System.in);
System.out.print("Pick a Food: (F)rench Fries or (I)ce Cream?: ");
String food = reader.nextLine();

System.out.print("Pick a Drink: (S)oda or (L)emonade: ");
String drink = reader.nextLine();

if(food.equals("F")){
	foodi=5.00;
	foods="French Fries";
}

if(food.equals("I")){
	foodi=3.75;
	foods="Ice Cream";
}

if(drink.equals("S")){
	drinki=2.25;
	drinks="Soda";
}

if(drink.equals("L")){
	drinki=3.5;
	drinks="Lemonade";
}

po=(drinki+foodi)*1.07;
System.out.print("Your order is 1 "+foods+" and 1 "+drinks+". The price is $");
System.out.printf("%.2f", po);
System.out.println("");


}
}


