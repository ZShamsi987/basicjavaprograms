import java.util.Scanner;
public class numsumthing{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("What is your first number: ");
int a = input.nextInt();

System.out.print("What is your second number: ");
int b = input.nextInt();

System.out.print("What is your third number: ");
int c = input.nextInt();

System.out.print("What is your fourth number: ");
int d = input.nextInt();

System.out.print("What is your fifth number: ");
int e = input.nextInt();

System.out.print("What is your sixth number: ");
int f = input.nextInt();

System.out.print("What is your seventh number: ");
int g = input.nextInt();

System.out.print("What is your eighth number: ");
int h = input.nextInt();

System.out.print("What is your ninth number: ");
int i = input.nextInt();

System.out.println(num1(a, b));
System.out.println(num2(c,d,e));
System.out.println(num3(f,g,h,i));
System.out.println(numQuot(a,b,c,d,e,f,g,h,i));
}

public static int num1(int a, int b){
return a+b;
}

public static int num2(int c, int d, int e){
return c+d+e;
}

public static int num3(int f, int g, int h, int i){
return f+g+h+i;
}

public static int numQuot(int f, int g, int h, int i){
return f+g+h+i;
}

public static double numQuot(int a, int b, int c, int d, int e, int f, int g, int h, int i){
return (a+b+c+d+e+f+g+h+i)/3.0;
}
}
