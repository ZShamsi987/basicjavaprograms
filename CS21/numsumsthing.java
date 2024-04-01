import java.util.Scanner;

public class numsumsthing{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("What is your first number: ");
int var1 = input.nextInt();
System.out.print("What is your second number: ");
int var2 = input.nextInt();
System.out.print("What is your third number: ");
int var3 = input.nextInt();
System.out.print("What is your fourth number: ");
int var4 = input.nextInt();
System.out.print("What is your fifth number: ");
int var5 = input.nextInt();
System.out.print("What is your sixth number: ");
int var6 = input.nextInt();
System.out.print("What is your seventh number: ");
int var7 = input.nextInt();
System.out.print("What is your eighth number: ");
int var8 = input.nextInt();
System.out.print("What is your ninth number: ");
int var9 = input.nextInt();

System.out.println(num1(var1, var2));
System.out.println(num2(var3,var4,var5));
System.out.println(num3(var6,var7,var8,var9));
System.out.println(numQuot(var1,var2,var3,var4,var5,var6,var7,var8,var9));
}

public static int num1(int var1, int var2){
return var1+var2;
}
public static int num2(int var3, int var4, int var5){
return var3+var4+var5;
}
public static int num3(int var6, int var7, int var8, int var9){
return var6+var7+var8+var9;
}
public static int numQuot(int var6, int var7, int var8, int var9){
return var6+var7+var8+var9;
}
public static double numQuot(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
return (var1+var2+var3+var4+var5+var6+var7+var8+var9)/3.0;
}
}
