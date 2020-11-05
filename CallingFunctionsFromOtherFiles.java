// Straxinja - 6/2020

import java.util.Scanner;

public class CallingFunctionsFromOtherFiles
{
	public static String weekday(int dd, int mm, int yyyy){
		int yy, total;

		yy = yyyy - 1900;
		total = yy / 4 + yy + dd + MonthOffset.monthOffset(mm);

		if(WeekdayCalculator.isLeap(yyyy)){
			if(MonthName.monthName(mm).equals("January") || MonthName.monthName(mm).equals("February")){
				total--;
			}
		}

		String wDay = WeekdayName.weekdayName(total%7);

		String date = "";

		date = wDay + "," + MonthName.monthName(mm) + " " + dd + ", " + yyyy;
		return date;
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
