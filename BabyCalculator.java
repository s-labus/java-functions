// Straxinja - 5/2020
import java.util.Scanner;

public class BabyCalculator
{
	
	public static int add(int first, int second){
		return first + second;
	}
	public static int sub(int first, int second){
		return first - second;
	}
	public static int multi(int first, int second){
		return first * second;
	}
	public static int divide(int first, int second){
		return first / second;
	}

	public static void main( String[] args ){
	
	Scanner scan = new Scanner(System.in);
	int one;
	String two;
	int three;

	System.out.println("Let's do some calculations baby...\n");
	do{
	
	System.out.print("> ");
	one = scan.nextInt();
	two = scan.next();
	three = scan.nextInt();
	
	if(two.equals("+")){System.out.println(add(one, three));}
	else if(two.equals("-")){System.out.println(sub(one, three));}
	else if(two.equals("*")){System.out.println(multi(one, three));}
	else if(two.equals("/")){System.out.println(divide(one, three));}
	System.out.println();		
	}while(one != 0);
	
	System.out.println("Byee, now.");
 }

}
