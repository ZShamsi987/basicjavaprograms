import java.util.Scanner;
public class salary{
static Scanner input = new Scanner(System.in);
static int num=0;
static int sum = 0;
static int x=0;
public static void main(String[] args){

for(int i = 0; i<9999999; i++){

System.out.print("What is your 4-digit number: ");
num = input.nextInt();

if(num<1000 || num>9999)
System.out.println("Invalid input. Please try again");
else break;
}

}
}