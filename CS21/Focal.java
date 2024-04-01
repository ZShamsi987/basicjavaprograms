import java.util.Scanner;
public class Focal{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the optic distance(in mm):");
double optdist = input.nextDouble();
System.out.print("Enter the image distance(in mm):");
double imgdist = input.nextDouble();
double foclen = 1/((1.0/imgdist)+(1.0/optdist));
System.out.println("The focal length is "+ foclen +" mm.\n");

System.out.print("Enter the focal length(in mm):");
double foclen1 = input.nextDouble();
System.out.print("Enter the optic distance(in mm):");
double optdist1 = input.nextDouble();
double imgdist1 = 1/((1.0/foclen1)-(1.0/optdist1));
System.out.println("The image distance is "+ imgdist1 +" mm.\n");

System.out.print("Enter the focal length(in mm):");
double foclen2 = input.nextDouble();
System.out.print("Enter the image distance(in mm):");
double imgdist2 = input.nextDouble();
double optdist2 = 1/((1.0/foclen2)-(1.0/imgdist2));
System.out.println("The image distance is "+ optdist2 +" mm.");
}
}
