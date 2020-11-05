// Straxinja Labus on 05/2020

public class DistanceFormula
{

	public static double distance(int x1, int y1, int x2, int y2){
		double x = x2 - x1;
		double y = y2 - y1;
		return Math.sqrt((x*x)+(y*y));
	}

	
	public static void main(String[] args){
	
	double d1 = distance(-2, 1, 1, 5);
	System.out.println("-2, 1 to 1, 5 => " + d1);

	System.out.println("-2, -3 to -4, 4 => " + distance(-2, -3, -4, 4));
	System.out.println("2, -3 to -1, -2 => " + distance(2, -3, -1, -2));
	System.out.println("4, 5 to 4, 5 => " + distance(4, 5, 4, 5)); 
}
}
