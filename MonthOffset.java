// Straxinja Labus on 05/2020

public class MonthOffset
{

	public static int monthOffset(int month){
	
	int result;
	switch(month){
	 case 1:
	 result = 1;
	 break;
	 case 2:
	 result = 4;
	 break;
	 case 3:
	 result = 4;
	 break;
	 case 4:
	 result = 0;
	 break;
	 case 5:
	 result = 2;
	 break;
	 case 6:
	 result = 5;
	 break;
	 case 7:
	 result = 0;
	 break;
	 case 8:
	 result = 3;
	 break;
	 case 9:
	 result = 6;
	 break;
	 case 10:
	 result = 1;
	 break;
	 case 11:
	 result = 4;
	 break;
	 case 12:
	 result = 6;
	 break;
	 default:
	 result = -1;
	}
	return result;
 }

	
	public static void main(String[] args){
	
	System.out.println("Month 1 offset: " + monthOffset(1));
	System.out.println("Month 2 offset: " + monthOffset(2));
	System.out.println("Month 3 offset: " + monthOffset(3));
	System.out.println("Month 4 offset: " + monthOffset(4));
	System.out.println("Month 5 offset: " + monthOffset(5));
	System.out.println("Month 6 offset: " + monthOffset(6));
	System.out.println("Month 7 offset: " + monthOffset(7));
	System.out.println("Month 8 offset: " + monthOffset(8));
	System.out.println("Month 9 offset: " + monthOffset(9));
	System.out.println("Month 10 offset: " + monthOffset(10));
	System.out.println("Month 11 offset: " + monthOffset(11));
	System.out.println("Month 12 offset: " + monthOffset(12));
	System.out.println("Month 43 offset: " + monthOffset(43));
	
 }
}
