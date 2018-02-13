import java.util.*;

public class Main
{
 public static void main(String args[])
 {
Scanner scan = new Scanner(System.in);

double length;
double width;
double radius;
double sidea;
double sideb;
double sidec;

System.out.print("Enter length of rectangle (positive integer ): ");
length = scan.nextDouble();

System.out.print("Enter width of rectangle (positive integer ): ");
width = scan.nextDouble();

System.out.print("Now enter the radius of the circle (positive integer ): ");
radius = scan.nextDouble();

System.out.print("Enter side A of triangle (positive integer): ");
sidea = scan.nextDouble();

System.out.print("Enter side B of triangle (positive integer): ");
sideb = scan.nextDouble();

System.out.print("Enter side C of triangle (positive integer): ");
sidec = scan.nextDouble();

double A = Math.pow(radius,2) * 3.14;
double S = (sidea + sideb + sidec) / 2;

System.out.println("Area of rectangle: " + (length * width) );
System.out.println("Area of circle: " + (A));
System.out.println("Perimeter of rectangle: " + (2 * (length + width)) );
System.out.println("Circumference of circle: " + (2 * 3.14 * radius) );
System.out.println("Area of triangle: " + Math.sqrt( S * (S-sidea) * (S-sideb) * (S-sidec)));
System.out.println("Perimeter of triangle: " + (sidea + sideb + sidec));

double RS;
double RPD;
double HRP;
double WRP;
double HC;
double RC;

System.out.print("Enter the radius of the sphere: ");
     RS = scan.nextDouble();

     System.out.print("Enter the diameter of the rectangular prism: ");
     RPD = scan.nextDouble();

     System.out.print("Enter the height of the rectangular prism: ");
     HRP = scan.nextDouble();

     System.out.print("Enter the width of the rectangular prism: ");
     WRP = scan.nextDouble();

     System.out.print("Enter the height of the cylinder: ");
     HC = scan.nextDouble();

     System.out.println("Enter the radius of the cylinder: ");
     RC = scan.nextDouble();

     double V = (radius * radius * radius) / 3;

     System.out.println("The surface area of the sphere is: " + (4 * 3.14 * (Math.pow(RS,2.0))) );
     System.out.println("The volume of the sphere is: " + (4 * 3.14 * (Math.pow(RS,3.0)/3) ));
     System.out.println("The surface area of a rectangular prism is: " + ( 2 * ((HRP * RPD) + (HRP * WRP) + (RPD * WRP))) );
     System.out.println("The volume of a rectangular prism is: " + (HRP * RPD * WRP));
     System.out.println("The surface area of a cylinder is: " + (( 2 * 3.14 * RC * HC) + ( 2 * 3.14 * Math.pow(RC,2.0))));
     System.out.println("The volume of a cylinder is: " + (3.14 * Math.pow(RC,2.0) * HC));







 }
}
