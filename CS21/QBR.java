import java.util.Scanner;
public class QBR{
public static void main(String[]args)
{
	Scanner input = new Scanner(System.in);
	Scanner input1 = new Scanner(System.in);
	System.out.print("Players name: ");
	String name = input.nextLine();
	System.out.print("How many yards did the player have: ");
	Double yard = input1.nextDouble();
	System.out.print("How many completions did the player have: ");
	Double comp = input1.nextDouble();
	System.out.print("How many TDS did the player have: ");
	Double td = input1.nextDouble();
	System.out.print("How many interceptions did the player have: ");
	Double inter = input1.nextDouble();
	System.out.print("How many attempts did the player have: ");
	Double att = input1.nextDouble();
	Double a = (((comp/att) *100)-30)/20;
	Double b = ((td/att) *100) /5;
	Double c = (9.5-((inter/att)*100))/4;
	Double d =((yard/att)-3)/4;
	Double quabr = (a+b+c+d)/0.06;

	System.out.print(name+"'s rating is: "+quabr+"\n\n");





}
}