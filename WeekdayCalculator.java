// Straxinja - 5/2020

import java.util.Scanner;

public class WeekdayCalculator
{
	public static String weekday(int dd, int mm, int yyyy){
		int yy, total;

		yy = yyyy - 1900;
		total = yy / 4 + yy + dd + monthOffset(mm);

		if(isLeap(yyyy)){
			if(monthName(mm).equals("January") || monthName(mm).equals("February")){
				total--;
			}
		}

		String wDay = weekdayName(total%7);

		String date = "";

		date = wDay + "," + monthName(mm) + " " + dd + ", " + yyyy;
		return date;
	}

public static String weekdayName(int weekday){
		String result = "";

		if(weekday == 1){
			result = "Sunday";
		}else if(weekday == 2){
			result = "Monday";
		}else if(weekday == 4){
			result = "Wednesday";
		}else if(weekday == 5){
			result = "Thursday";
		}else if(weekday == 6){
			result = "Friday";
		}else if(weekday == 7){
			result = "Saturday";
		}else{
			result = "Tuesday";
		}

		return result;
	}

public static int monthOffset(int mm){
	
	int result;
	switch(mm){
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


	public static String monthName(int mm){

	String result = "";
	switch(mm){
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

	// paste your functions from MonthName, WeekdayName, and MonthOffset here


	public static boolean isLeap(int year){
		boolean result;
		if(year%400 == 0){result = true;}
		else if(year%100 == 0){result = false;}
		else if(year%4 == 0){result = true;}
		else{result = true;}
		return result;
	}
	
	public static void main( String[] args ){

	Scanner scan = new Scanner(System.in);

	System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
	System.out.println();
	System.out.println("All you have to do is enter your birthday, and it will tell you the day of the week on which you were born.");

	System.out.println("Some automatic tests...");

	/*tests, couple goes here*/

	System.out.println("10 12 2003 => " + weekday(10, 12, 2003));
	System.out.println("15 1 2003 => " + weekday(15, 1, 2003));
	System.out.println("2 7 1977 => " + weekday(2, 7, 1977));
	System.out.println("13 10 2000 => " + weekday(13, 10, 2000));
	System.out.println();
	System.out.print("Not it's your turn! What's your birthday? Birthday (mm dd yyyy): ");
	int mm = scan.nextInt();
	int dd = scan.nextInt();
	int yyyy = scan.nextInt();
	System.out.println();
	System.out.println(weekday(mm, dd, yyyy));

	
 }

}
