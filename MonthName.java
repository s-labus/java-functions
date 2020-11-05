// Straxinja Labus on 05/2020

public class MonthName
{

	public static String monthName(int month){
	
	String result = "";
	switch(month){
	 case 1:
	 result = "January";
	 break;
	 case 2:
	 result = "February";
	 break;
	 case 3:
	 result = "March";
	 break;
	 case 4:
	 result = "April";
	 break;
	 case 5:
	 result = "May";
	 break;
	 case 6:
	 result = "June";
	 break;
	 case 7:
	 result = "July";
	 break;
	 case 8:
	 result = "August";
	 break;
	 case 9:
	 result = "September";
	 break;
	 case 10:
	 result = "October";
	 break;
	 case 11:
	 result = "November";
	 break;
	 case 12:
	 result = "December";
	 break;
	}
	return result;
 }

	
	public static void main(String[] args){
	
	System.out.println("Month 1: " + monthName(1));
	System.out.println("Month 2: " + monthName(2));
	System.out.println("Month 3: " + monthName(3));
	System.out.println("Month 4: " + monthName(4));
	System.out.println("Month 5: " + monthName(5));
	System.out.println("Month 6: " + monthName(6));
	System.out.println("Month 7: " + monthName(7));
	System.out.println("Month 8: " + monthName(8));
	System.out.println("Month 9: " + monthName(9));
	System.out.println("Month 10: " + monthName(10));
	System.out.println("Month 11: " + monthName(11));
	System.out.println("Month 12: " + monthName(12));	
 }
}
