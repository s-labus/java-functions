// Straxinja - 5/2020
import java.util.Scanner;

public class Refresher
{
	

	public static void main( String[] args ){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = scan.next();
	
		int n = 10;
		if(name.equals("Mitchell")){ n = 5;}

		System.out.println();

		for(int i = 1; i <= n; i++){
			System.out.println(i + " " + name);
		}	
	}

}
