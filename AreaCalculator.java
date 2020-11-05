// Straxinja Labus on 05/2020
import java.util.Scanner;

public class AreaCalculator
{

	public static double area_circle(int radius){
		return radius * radius * Math.PI;
	}

	public static int area_rectangle(int length, int width){ return length * width;}

	public static int area_square(int side){return side * side;}

	public static double area_triangle(int base, int height){
		return base * 0.5 * height;
	}
	
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	int choice = 0;

	// triangle
	int base;
	int height;

	// rectangle
	int length;
	int width;

	// square
	int side;
	
	// circle
	int radius;

	System.out.println("Shape Area Calculator version 0.1 (c) 2020 S. Labus - SMPC");

	do{
	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

	System.out.println("1) Triangle");
	System.out.println("2) Rectangle");
	System.out.println("3) Square");
	System.out.println("4) Circle");
	System.out.println("5) Quit");

	System.out.print("Which shape: ");
	choice = scan.nextInt();
	System.out.println();
	
	if(choice == 1){ 
	 System.out.print("Base: "); base = scan.nextInt(); 
	 System.out.print("Height: "); height = scan.nextInt(); 
	 System.out.println();
	 System.out.println("The area is " + area_triangle(base, height) + ".");
	}else if(choice == 2){ 
	 System.out.print("Length: "); length = scan.nextInt(); 
	 System.out.print("Width: "); width = scan.nextInt();
	 System.out.println();
	 System.out.println("The area is " + area_rectangle(length, width) + ".");
	}else if(choice == 3){ 
	 System.out.print("Side: "); side = scan.nextInt(); 
	 System.out.println();
	 System.out.println("The area is " + area_square(side) + ".");
	}else if(choice == 4){ 
	 System.out.print("Radius: "); radius = scan.nextInt(); 
	 System.out.println();
	 System.out.println("The area is " + area_circle(radius) + ".");
	}
	
	}while(choice != 5);

	System.out.println("Goodbye.");	
 }
}
