import java.util.Scanner;
public class GPACALC {
public static void main(String[]args){
Scanner Input = new Scanner(System.in);
Scanner Input1 = new Scanner(System.in);

System.out.print("Please enter the name of the student: ");
String name = Input.nextLine();

System.out.print("Please enter the name of the first class: ");
String first = Input.nextLine();
System.out.print("How many credits is this cource worth: ");
Double credits = Input1.nextDouble();
System.out.print("How many grade points did you earn: ");
Double grade = Input1.nextDouble();

System.out.print("Please enter the name of the second class: ");
String second = Input.nextLine();
System.out.print("How many credits is this cource worth: ");
Double credits1 = Input1.nextDouble();
System.out.print("How many grade points did you earn: ");
Double grade1 = Input1.nextDouble();

System.out.print("Please enter the name of the third class: ");
String third = Input.nextLine();
System.out.print("How many credits is this cource worth: ");
Double credits2 = Input1.nextDouble();
System.out.println("How many grade points did you earn: ");
Double grade2 = Input1.nextDouble();

Double WGPA = ((credits*grade)+(credits1*grade1)+(credits2*grade2))/(credits+credits1+credits2);

System.out.print("\n\n"+name+"\nClass\tCredits\tGrade Point\n"+first+"\t"+credits+"\t"+grade+"\n"+second+"\t"+credits1+"\t"+grade1+"\n"
+third+"\t"+credits2+"\t"+grade2+"\n"+"GPA: "+WGPA+"\n");









}
}