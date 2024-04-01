import java.util.Scanner;
public class twof{

static Scanner input = new Scanner(System.in);
static int num;

public static void main(String[] args){
Scanner Input = new Scanner(System.in);
System.out.print("Please enter a number: ");
num = input.nextInt();
System.out.print("Would you like to (a)dd 2, (s)ubtract 2,(m)ultiply by 2, (d)ivide by 2, or (r)aise to the 2nd power:  ");
String x = Input.nextLine();

if(x.equals("a") || x.equals("A"))
a();

else if(x.equals("s") || x.equals("S"))
s();

else if(x.equals("m") || x.equals("M"))
m();

else if(x.equals("d") || x.equals("D"))
d();

else if(x.equals("r") || x.equals("R"))
r();


}


public static void a(){
System.out.println("The result when adding "+num+" by 2 is "+(double)(num+2.0));
}

public static void s(){
System.out.println("The result when subtracting "+num+" by 2 is "+(double)(num-2.0));
}

public static void m(){
System.out.println("The result when multiplying "+num+" by 2 is "+(double)(num*2.0));
}

public static void d(){
System.out.println("The result when dividing "+num+" by 2 is "+(double)(num/2.0));
}

public static void r(){
System.out.println("The result when raising "+num+" by 2 is "+(double)(num*num));
}




}