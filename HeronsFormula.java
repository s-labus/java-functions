// Straxinja Labus on 05/2020

public class HeronsFormula
{

	public static double triangleArea(int a, int b, int c){
		double s;
		double A;

		s = (a+b+c)/2.0;
		A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return A;
	}	

	public static void main(String[] args){
	
	double a;
	a = triangleArea(3, 3, 3);
	System.out.println("A triangle with sides 3, 3, 3 has an area of " + a + ".");

	a = triangleArea(3, 4, 5);
	System.out.println("A triangle with sides 3, 4, 5 has an area of " + a + ".");

	a = triangleArea(7, 8, 9);
	System.out.println("A triangle with sides 7, 8, 9 has an area of " + a + ".");

	System.out.println("A triangle with sides 4, 6, 9 has an area of " + triangleArea(4,6,9) + ".");
System.out.println("A triangle with sides 9, 9, 9 has an area of " + triangleArea(9,9,9) + ".");
 }
}
