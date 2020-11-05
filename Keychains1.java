// Straxinja - 5/2020
import java.util.Scanner;

public class Keychains1
{
	public static void add_keychains(){System.out.println("ADD KEYCHAINS \n");}
	public static void remove_keychains(){System.out.println("REMOVE KEYCHAINS \n");}
	public static void view_order(){System.out.println("VIEW ORDER \n");}
	public static void checkout(){System.out.println("CHECKOUT \n");}
	
	public static void main( String[] args ){

	Scanner scan = new Scanner(System.in);
	int choice = 0;

	System.out.println("Ye Olde Keychaing Shoppe");
	
	System.out.println();

	do{
		System.out.println("1. Add Keychains to Order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout");
		System.out.println();
		System.out.print("Please enter your choice: ");

		choice = scan.nextInt();

		System.out.println();

		if(choice == 1){add_keychains();}
		else if(choice == 2){remove_keychains();}
		else if(choice == 3){view_order();}
	}
	while(choice != 4);
	
	checkout();	
 }

}
