import java.util.Scanner;
public class fourell {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Please enter a 4-digit number: ");
int num = scanner.nextInt();

if (is4DigitNumber(num)) {
if (isEven(num) && isDivisibleBy11(num)) {
System.out.println("The number is both even and divisible by 11."); }
else {
System.out.println("The number is not even and divisible by 11."); } }

else {
System.out.println("The number is not a 4-digit number."); } }

public static boolean is4DigitNumber(int num) {
return num >= 1000 && num <= 9999; }

public static boolean isEven(int num) {
return num% 2 == 0; }
public static boolean isDivisibleBy11(int num) {
return num % 11 == 0; } }

//https://stackoverflow.com/questions/8140959/iseven-in-another-method  i used this thing in my program, i thought it was easier, https://www.geeksforgeeks.org/java-program-to-check-whether-number-is-divisible-by-5/