// Straxinja - 5/2020

import java.util.Scanner;

public class Calculator
{
	public static int add(int one, int two){ return one + two;}
	//public static double add(double one, double two){ return one + two;}
	public static int div(int one, int two){ return one - two;}
	
	public static void main( String[] args ){
	
	Scanner sc = new Scanner(System.in);
	String first;
	String mark;
	String second;

	boolean n1, n2;
	int one, two;
	
	do{

	first = sc.next();
	mark = sc.next();
	second = sc.next();

	if(mark.equals("+")){
		n1 = Numeric.isInteger(first);
		n2 = Numeric.isInteger(second);
		one = Integer.valueOf(first);
		two = Integer.valueOf(second);	
		if(n1 && n2){
		System.out.println(add(one, two));}}
	//else if(mark.equals("-")){System.out.println(div(first, second));}
	}while(!first.equals("0"));	

 }

}
