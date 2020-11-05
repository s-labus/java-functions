// More Fill-In Functions - Fix the broken functions and function calls (again).

import java.util.Scanner;
import java.util.Random;

public class MoreFillInFunctions
{
	public static void main( String[] args ){

	Scanner scan = new Scanner(System.in);
	String nick;
 	
	System.out.println("Here we go. \n");
	System.out.println("Some random numbers, if you please: ");
	rndnum();
	System.out.println();
	System.out.print("More counting, but this time not by ones: ");
	ctn();
	System.out.println();
	System.out.println("434521 -> " + pgrade(4, 3, 4, 5, 2, 1));
	System.out.println();
	System.out.print("Finally, some easy ones. Please enter your name: ");
	nick = scan.next();
	name(nick);
 }

	public static String name(String n){
		String result = "";
		System.out.println("Hi, " + n);
		System.out.println();
		System.out.println("Do you feel lucky, punk? ");
		if(n.length() > 10){result = "You win";}else{result = "You lose";}
		System.out.println(result);
		return result;
	}

	public static int pgrade(int a, int b, int c, int d, int e, int f){
	System.out.println("Let's figure a project grade.");
	int total = a*5 + b*4 + c*4 + d*4 + e*1 + f*1;
	return total;
	}

	public static void ctn(){
	for(int i = 2; i <= 10; i+=2){
	 System.out.print(i + " ");
		if(i == 10){
		for(int j = i-2; j >= 2; j-=2){System.out.print(j + " "); if(j==2){break;}} 
		}
	}
 }

	public static void rndnum(){
	
	Random r = new Random();

	int first = 1 + r.nextInt(15);
	int second = 1 + r.nextInt(15);
	
	System.out.println("First: " + first);
	System.out.println("Second: " + second);
	
	if(first == second){System.out.println("They are the same.");} 
	else {System.out.println("They were not the same.");}	
 }


}
