// Straxinja - 5/2020
import java.util.Scanner;

public class Keychains2
{
	public static int add_keychains(int add){
		return add;
	}

	public static int remove_keychains(int rem){
		return rem;
	}

	public static void view_order(int kchains, int cost){
		System.out.println("You have " + kchains + " keychains.");
		System.out.println("Keychains cost $" + cost + " each.");
		System.out.println("Total cost is $" + (kchains*cost) + ".\n");
	}

	public static void checkout(int quantity, int cost){
			System.out.println("Keychains cost $" + cost + " each.");
			System.out.println("Total cost is $" + (cost*quantity) + ".\n");
	}
		
	public static void main( String[] args ){
	int current = 0;
	int pricePerKeyChain = 10;
	String name;

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

		if(choice == 1){
			System.out.println("ADD KEYCHAINS \n");
	 		System.out.print("You have " + current + " keychains. How many to add? ");
			current += add_keychains(scan.nextInt());
			System.out.println("You now have " + current + " keychains.\n");
			}
		else if(choice == 2){
			System.out.print("You have " + current + " keychains. How many to remove? ");
			current -=  remove_keychains(scan.nextInt());
			System.out.println("You now have " + current + " keychains.\n");
		}
		else if(choice == 3){
			view_order(current, pricePerKeyChain);
		}
	}
	while(choice != 4);

	System.out.println("CHECKOUT \n");
	System.out.print("What is your name? ");
	name = scan.next();
	
	checkout(current, pricePerKeyChain);
	System.out.println("Thanks for your order, " + name + "!\n");	
 }

}
