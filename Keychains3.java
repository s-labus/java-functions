// Straxinja - 5/2020
import java.util.Scanner;

public class Keychains3
{
	public static int add_keychains(int add){
		return add;
	}

	public static int remove_keychains(int rem){
		return rem;
	}

	public static void view_order(int kchains, int cost, double tax, double shipping, double addcost){
		double scharges = shipping + addcost*kchains;
		int product = kchains * cost;
		System.out.println("You have " + kchains + " keychains.");
		System.out.println("Keychains cost $" + cost + " each.");
		System.out.println("Product cost $" + product + " each.");
		System.out.println("Shipping charges on the order $" + scharges + ".");
		System.out.println("Subtotal before tax $" + (product + scharges) + ".");
		System.out.println("Tax is $" + tax + ".");
		System.out.println("Total cost is $" + (product + scharges + tax) + ".\n");
	}

	public static void checkout(int quantity, int cost, double tax, double shipping, double addcost){		double scharges = shipping + addcost * quantity;
			System.out.println("Keychains cost $" + cost*quantity + " each.");
			System.out.println("Shipping charges on the order $" + scharges + ".");
			System.out.println("Taxes are $" + tax + ".");
			System.out.println("Total cost is $" + (cost*quantity + scharges + tax) + ".\n");
	}
		
	public static void main( String[] args ){
	int current = 0;
	int pricePerKeyChain = 10;
	int newProducts;
	double tax = 8.25;
	double shipping = 5;
	double addscost = 1;
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
			newProducts = scan.nextInt();
				while(newProducts < 0){
				 System.out.println("Can not add negative numbers, try again.");
				 newProducts = scan.nextInt();
				}			
			current += add_keychains(newProducts);
			System.out.println("You now have " + current + " keychains.\n");
			}
		else if(choice == 2){
			if(current == 0){System.out.println("You can NOT empty what empty is, young padawan."); break;}		
			System.out.print("You have " + current + " keychains. How many to remove? ");
				newProducts = scan.nextInt();				
				while(newProducts > current || newProducts < 0){
				if(newProducts < 0){System.out.println("Can not subtract with negative numbers, try again.");}
				else{System.out.println("You can NOT empty more than in cart is, young padawan.");}
				 newProducts = scan.nextInt();
				}
			current -=  remove_keychains(newProducts);
			System.out.println("You now have " + current + " keychains.\n");
		}
		else if(choice == 3){
			view_order(current, pricePerKeyChain, tax, shipping, addscost);
		}
	}
	while(choice != 4);

	System.out.println("CHECKOUT \n");
	System.out.print("What is your name? ");
	name = scan.next();
	
	checkout(current, pricePerKeyChain, tax, shipping, addscost);
	System.out.println("Thanks for your order, " + name + "!\n");	
 }

}
