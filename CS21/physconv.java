import java.util.Scanner;

public class physconv {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Select a conversion type: (Force), (Distance), or (Volume)");

String conversionType = scanner.nextLine();

if (conversionType.equals("Force")) {
System.out.println("Select a Force conversion: (Pounds to Newtons) or (Newtons to Pounds)");

String forceConversion = scanner.nextLine();

if (forceConversion.equals("Pounds to Newtons")) {
System.out.println("Enter the value in pounds:");

double pounds = scanner.nextDouble();
double newtons = pounds * 4.9;

System.out.println(pounds + " pounds is equal to " + newtons + " Newtons."); }

else if (forceConversion.equalsIgnoreCase("Newtons to Pounds")) {
System.out.println("Enter the value in Newtons:");

double newtons = scanner.nextDouble();
double pounds = newtons / 4.9;
System.out.println(newtons + " Newtons is equal to " + pounds + " pounds."); }

else { System.out.println("Invalid Force conversion selection."); } }

else if (conversionType.equals("Distance")) {
System.out.println("Select a Distance conversion: (Feet to Meters) or (Meters to Feet)");
String distanceConversion = scanner.nextLine();

if (distanceConversion.equals("Feet to Meters")) {
System.out.println("Enter the value in feet:");

double feet = scanner.nextDouble();
double meters = feet / 3.28;

System.out.println(feet + " feet is equal to " + meters + " meters."); }

else if (distanceConversion.equals("Meters to Feet")) {
System.out.println("Enter the value in meters:");

double meters = scanner.nextDouble();

double feet = meters * 3.28;

System.out.println(meters + " meters is equal to " + feet + " feet."); }

else { System.out.println("Invalid Distance conversion selection."); } }

else if (conversionType.equals("Volume")) {

System.out.println("Select a Volume conversion: (Gallons to Liters) or (Liters to Gallons)");
String volumeConversion = scanner.nextLine();

if (volumeConversion.equalsIgnoreCase("Gallons to Liters")) {

System.out.println("Enter the value in gallons:");
double gallons = scanner.nextDouble();
double liters = gallons * 3.79;

System.out.println(gallons + " gallons is equal to " + liters + " liters."); }

else if (volumeConversion.equalsIgnoreCase("Liters to Gallons")) {

System.out.println("Enter the value in liters:");

double liters = scanner.nextDouble();
double gallons = liters / 3.79;

System.out.println(liters + " liters is equal to " + gallons + " gallons."); }

else { System.out.println("Invalid Volume conversion selection."); } }

else { System.out.println("Invalid conversion type selection."); }
}
}